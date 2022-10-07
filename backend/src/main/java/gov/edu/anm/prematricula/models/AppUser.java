package gov.edu.anm.prematricula.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_APP_USER")
public class AppUser {
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private UUID id;
	
	private String nome;
	
	private String password;
	
	@OneToMany
	@JoinColumn(name = "USER_ID", referencedColumnName = "id")
	private List<AppRole> roles = new ArrayList<>();

	public AppUser() {
		
	}
	
	public AppUser(String nome, String password, List<AppRole> roles) {
		
		this.nome = nome;
		this.password = password;
		this.roles = roles;
	}
	
	public AppUser(UUID id, String nome, String password, List<AppRole> roles) {
		this.id = id;
		this.nome = nome;
		this.password = password;
		this.roles = roles;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<AppRole> getRoles() {
		return roles;
	}

	public void setRoles(List<AppRole> roles) {
		this.roles = roles;
	}
	
}
