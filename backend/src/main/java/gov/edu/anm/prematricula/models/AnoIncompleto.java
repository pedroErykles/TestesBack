package gov.edu.anm.prematricula.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class AnoIncompleto extends Ano {
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_ANO_INCOMPLETO", referencedColumnName = "id")
	private List<Bimestre> bimestres = new ArrayList<Bimestre>();
	
	
	public AnoIncompleto(List<Bimestre> bimestres) {
		this.bimestres = bimestres;
	}

	public AnoIncompleto() {
		
	}

	public List<Bimestre> getBimestres() {
		return bimestres;
	}


	public void setBimestres(List<Bimestre> bimestres) {
		this.bimestres = bimestres;
	}


	@Override
	public Double getMediaAnual() {
		
		Double acumulador = 0.0;
		
		for (var bimestre : bimestres) {
			acumulador += bimestre.getMediaBimestral();
			
		}
		
		return acumulador/bimestres.size();
	}
}
