package gov.edu.anm.prematricula.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_REDE_DE_ENSINO")
public enum RedeDeEnsino {
	PUBLICA("Publica"),
	PARTICULAR("Particular");
	
	@Id
	private Integer id;
	
	public String rede;
	
	RedeDeEnsino(String rede){
		this.rede = rede;
	}
	
	@Override
	public String toString() {
		return rede;
	}
}
