package gov.edu.anm.prematricula.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CURSO")
public enum Curso {
	
	ADMINISTRACAO("Administração"),
	ENFERMAGEM("Enfermagem"),
	INFORMATICA("Informática");
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	Curso(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
}
