package gov.edu.anm.prematricula.models;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TB_BIMESTRE")
public class Bimestre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ElementCollection
	@CollectionTable(name = "TB_MEDIAS_BIMESTRAIS",
	joinColumns = {@JoinColumn(name = "bimestre_id", referencedColumnName="id")})
	@MapKeyColumn(name = "ID_MATERIA")
	@Column(name = "NOTA")
	private Map<UUID, Double> mediasBimestrais = new HashMap<UUID, Double>();
	
	public Double getMediaBimestral() {
		
		Double acumulador = 0.0;
		
		for (var media : mediasBimestrais.entrySet()) {
			acumulador += media.getValue();
		}
		
		return acumulador/mediasBimestrais.size();
	}

	public Bimestre() {
		
	}

	public Bimestre(Map<UUID, Double> mediasBimestrais) {
		
		this.mediasBimestrais = mediasBimestrais;
	}

	public Map<UUID, Double> getMediasBimestrais() {
		return mediasBimestrais;
	}

	public void setMediasBimestrais(Map<UUID, Double> mediasBimestrais) {
		this.mediasBimestrais = mediasBimestrais;
	}
	
}
