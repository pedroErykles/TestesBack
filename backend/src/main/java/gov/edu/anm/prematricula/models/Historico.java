package gov.edu.anm.prematricula.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "TB_HISTORICO")
public class Historico {
	
	@Id
	@GeneratedValue(generator="UUID")
	@GenericGenerator(name="UUID", strategy="org.hibernate.id.UUIDGenerator")
	private UUID id;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Ano> anos = new ArrayList<Ano>();
	
	private Double mediaTotal;
	
	public Historico() {
		
	}
	
	public Historico(List<Ano> anos, Double mediaTotal) {
		this.anos = anos;
		this.mediaTotal = mediaTotal;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public List<Ano> getAnos(){
		return anos;
	}
	
	public void setAnos(List<Ano> anos) {
		this.anos = anos;
	}
	
	public Double getMediaTotal() {
		return mediaTotal;
	}
	
	public void setMediaTotal(Double mediaTotal) {
		this.mediaTotal = mediaTotal;
	}
	
	public void setMediaTotal() {
		Double acumulador = 0.0;
		for (Ano ano : anos) {
			acumulador += ano.getMediaAnual();
		}
		this.mediaTotal = acumulador / anos.size();
	}
}
