package Teste.com.teste.DTO;

import java.time.LocalDate;

import Teste.com.teste.Model.Noticia;

public class NoticiaDTO {
	
	private Long id;
	private String nome;
	private LocalDate data;
	private String conteudo;
	
	public NoticiaDTO() {		
	}

	public NoticiaDTO(Long id, String nome, LocalDate data, String conteudo) {
		this.id = id;
		this.nome = nome;
		this.data = data;
		this.conteudo = conteudo;
	}
	
	public NoticiaDTO(Noticia entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.data = entity.getData();
		this.conteudo = entity.getConteudo();
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
}
