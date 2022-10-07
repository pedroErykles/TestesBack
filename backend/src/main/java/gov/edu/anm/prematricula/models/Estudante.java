package gov.edu.anm.prematricula.models;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "TB_STUDENT")
public class Estudante {
	
	@Id
	@Column(name = "student_id")
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private UUID id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_historico", referencedColumnName = "id")
	private Historico historico;

	private String nome;

	private Curso curso;

	private String telefone;

	private RedeDeEnsino redeDeEnsino;

	private Concorrencia concorrencia;
	
	private boolean pCD;
	
	private String nomeSocial;
	
	private boolean aprovacaoValida;

	public Estudante() {
	}

	public Estudante(Historico historico, String nome, Curso curso, String telefone, RedeDeEnsino redeDeEnsino,
			Concorrencia concorrencia, boolean pCD, String nomeSocial, boolean aprovacaoValida) {
		this.historico = historico;
		this.nome = nome;
		this.curso = curso;
		this.telefone = telefone;
		this.redeDeEnsino = redeDeEnsino;
		this.concorrencia = concorrencia;
		this.pCD = pCD;
		this.nomeSocial = nomeSocial;
		this.aprovacaoValida = aprovacaoValida;
	}

	public Historico getHistorico() {
		return historico;
	}

	public void setHistorico(Historico historico) {
		this.historico = historico;
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

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public RedeDeEnsino getRedeDeEnsino() {
		return redeDeEnsino;
	}

	public void setRedeDeEnsino(RedeDeEnsino redeDeEnsino) {
		this.redeDeEnsino = redeDeEnsino;
	}

	public Concorrencia getConcorrencia() {
		return concorrencia;
	}

	public void setConcorrencia(Concorrencia concorrencia) {
		this.concorrencia = concorrencia;
	}

	public boolean isPCD() {
		return pCD;
	}

	public void setPCD(boolean pCD) {
		this.pCD = pCD;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public boolean isAprovacaoValida() {
		return aprovacaoValida;
	}

	public void setAprovacaoValida(boolean aprovacaoValida) {
		this.aprovacaoValida = aprovacaoValida;
	}


}
