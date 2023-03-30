package Teste.com.teste.DTO;

import Teste.com.teste.Model.Episodio;

public class EpisodioDTO {
	
	private Long id;
	private String nome;
	private Double duracao;
	private int temporada;
	
	private UsuarioDTO usuario;
	
	public EpisodioDTO() {		
	}

	public EpisodioDTO(Episodio entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.duracao = entity.getDuracao();
		this.temporada = entity.getTemporada();
		this.usuario = new UsuarioDTO(entity.getUsuario());
	}
	
	public EpisodioDTO(Long id, String nome, Double duracao, int temporada, UsuarioDTO usuario) {
		this.id = id;
		this.nome = nome;
		this.duracao = duracao;
		this.temporada = temporada;
		this.usuario = usuario;
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

	public Double getDuracao() {
		return duracao;
	}

	public void setDuracao(Double duracao) {
		this.duracao = duracao;
	}

	public int getTemporada() {
		return temporada;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	public UsuarioDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}
}
