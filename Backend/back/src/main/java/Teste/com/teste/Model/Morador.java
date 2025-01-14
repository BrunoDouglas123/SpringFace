package Teste.com.teste.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "morador")
public class Morador implements Serializable {
	private static final long serialVersionUID = -6123863495993106827L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome", length = 90, nullable = false)
	private String nome;
	
	@Column(name = "ocupacao", length = 90, nullable = false)
	private String ocupacao;
	
	@Column(name = "pena", length = 90, nullable = false)
	private int pena;
	
	@Column(name = "parente", length = 90, nullable = false)
	private String parente;
	
	@Column(name = "idade", length = 90, nullable = false)
	private int idade;

	@ManyToOne
	@JoinColumn(name = "id_local")
	private Local local;
	
	public Morador() {		
	}

	public Morador(Long id, String nome, String ocupacao, int pena, String parente, int idade, Local local) {
		super();
		this.id = id;
		this.nome = nome;
		this.ocupacao = ocupacao;
		this.pena = pena;
		this.parente = parente;
		this.idade = idade;
		this.local = local;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}

	public int getPena() {
		return pena;
	}

	public void setPena(int pena) {
		this.pena = pena;
	}

	public String getParente() {
		return parente;
	}

	public void setParente(String parente) {
		this.parente = parente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return "Morador [id=" + id + ", nome=" + nome + ", ocupacao=" + ocupacao + ", pena=" + pena + ", parente="
				+ parente + ", idade=" + idade + ", local=" + local + "]";
	}
}
