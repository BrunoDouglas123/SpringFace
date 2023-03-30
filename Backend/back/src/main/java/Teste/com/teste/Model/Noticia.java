package Teste.com.teste.Model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "noticia")
public class Noticia implements Serializable {
	private static final long serialVersionUID = 4110769841176959908L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome", length = 90, nullable = false)
	private String nome;
	
	@Column(name = "data")
	private LocalDate data;
	
	@Column(name = "conteudo", length = 290, nullable = false)
	private String conteudo;
	
	public Noticia() {		
	}

	public Noticia(Long id, String nome, LocalDate data, String conteudo) {
		this.id = id;
		this.nome = nome;
		this.data = data;
		this.conteudo = conteudo;
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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	@Override
	public String toString() {
		return "Noticia [id=" + id + ", nome=" + nome + ", data=" + data + ", conteudo=" + conteudo + "]";
	}
}
