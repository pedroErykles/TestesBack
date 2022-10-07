package gov.edu.anm.prematricula.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CURSO")
public enum Curso {
	
	ADMINISTRACAO(1, "Administração"),
	ENFERMAGEM(2, "Enfermagem"),
	INFORMATICA(3, "Informática");
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private Integer code;
	
	Curso(Integer code, String nome){
		this.code = code;
		this.nome = nome;
	}
	
	public Integer getCode() {
		return code;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
	public static Curso toEnum(Integer code) {
		if(code == null) {
			return null;
		}
		for(Curso x : Curso.values()) {
			if(code.equals(x.getCode())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Código " + code + " inválido.");
	}
	
}
