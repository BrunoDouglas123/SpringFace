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
@Table(name = "temporada")
public class Temporada implements Serializable {
	private static final long serialVersionUID = -320418644988359210L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numero", length = 90, nullable = false)
	private int numero;
	
	@ManyToOne
	@JoinColumn(name = "id_episodio")
	private Episodio episodio;
	
	public Temporada() {		
	}

	public Temporada(Long id, int numero, Episodio episodio) {
		this.id = id;
		this.numero = numero;
		this.episodio = episodio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Episodio getEpisodio() {
		return episodio;
	}

	public void setEpisodio(Episodio episodio) {
		this.episodio = episodio;
	}

	@Override
	public String toString() {
		return "Temporada [id=" + id + ", numero=" + numero + ", episodio=" + episodio + "]";
	}
}
