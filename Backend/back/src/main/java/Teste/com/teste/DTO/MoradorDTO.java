package Teste.com.teste.DTO;

import Teste.com.teste.Model.Morador;

public class MoradorDTO {
	
	private Long id;
	private String nome;
	private String ocupacao;
	private int pena;
	private String parente;
	private int idade;
	
	private LocalDTO local;
	
	public MoradorDTO() {				
	}

	public MoradorDTO(Long id, String nome, String ocupacao, int pena, String parente, int idade, LocalDTO local) {
		this.id = id;
		this.nome = nome;
		this.ocupacao = ocupacao;
		this.pena = pena;
		this.parente = parente;
		this.idade = idade;
		this.local = local;
	}
	
	public MoradorDTO(Morador entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.ocupacao = entity.getOcupacao();
		this.pena = entity.getPena();
		this.parente = entity.getParente();
		this.idade = entity.getIdade();
		this.local = new LocalDTO (entity.getLocal());
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

	public LocalDTO getLocal() {
		return local;
	}

	public void setLocal(LocalDTO local) {
		this.local = local;
	}
}
