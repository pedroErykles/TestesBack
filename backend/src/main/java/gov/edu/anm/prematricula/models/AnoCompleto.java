package gov.edu.anm.prematricula.models;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;

@Entity
public class AnoCompleto extends Ano {
	
	@ElementCollection
	@CollectionTable(name = "TB_NOTAS_ANO_COMPLETO",
	joinColumns = {@JoinColumn(name = "ano_id", referencedColumnName="id")})
	@MapKeyColumn(name = "ID_MATERIA")
	@Column(name = "NOTA")
	private Map<UUID, Double> mediasAnuais = new HashMap<UUID, Double>();

	public AnoCompleto(Map<UUID, Double> mediasAnuais) {
		this.mediasAnuais = mediasAnuais;
	}
	
	public AnoCompleto() {		
	}

	@Override
	public Double getMediaAnual() {
		
		Double acumulador = 0.0;
		
		for (var media : mediasAnuais.entrySet()) {
			acumulador += media.getValue();
		}
		
		return acumulador/mediasAnuais.size();
	}
	
	
	
}
