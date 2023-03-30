package Teste.com.teste.DTO;

import Teste.com.teste.Model.Tipo;

public class TipoDTO {
	
	private Long id;
	private String nome;
	private EpisodioDTO episodio;
	
	public TipoDTO() {		
	}

	public TipoDTO(Long id, String nome, EpisodioDTO episodio) {
		this.id = id;
		this.nome = nome;
		this.episodio = episodio;
	}
	
	public TipoDTO(Tipo entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.episodio = new EpisodioDTO(entity.getEpisodio());
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

	public EpisodioDTO getEpisodio() {
		return episodio;
	}

	public void setEpisodio(EpisodioDTO episodio) {
		this.episodio = episodio;
	}
}
