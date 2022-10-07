package gov.edu.anm.prematricula.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CONCORRENCIA")
public enum Concorrencia {
	AMPLA("Ampla"),
	BAIRRO("Bairro");
	
	@Id
	private Integer id;
	
	private String descricao;
	
	Concorrencia(String descricao){
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
}
