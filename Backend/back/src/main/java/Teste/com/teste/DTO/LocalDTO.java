package Teste.com.teste.DTO;

import Teste.com.teste.Model.Local;

public class LocalDTO {
	
	private Long id;
	private String nome;
	private String ramo;
	private String proprietario;
	
	public LocalDTO() {		
	}

	public LocalDTO(Long id, String nome, String ramo, String proprietario) {
		this.id = id;
		this.nome = nome;
		this.ramo = ramo;
		this.proprietario = proprietario;
	}
	
	public LocalDTO(Local entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.ramo = entity.getRamo();
		this.proprietario = entity.getProprietario();
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

	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
}
