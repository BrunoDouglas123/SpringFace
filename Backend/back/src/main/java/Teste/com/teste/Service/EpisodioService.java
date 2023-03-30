package Teste.com.teste.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Teste.com.teste.DTO.EpisodioDTO;
import Teste.com.teste.Model.Usuario;
import Teste.com.teste.Model.Episodio;
import Teste.com.teste.Repository.UsuarioRepository;
import Teste.com.teste.Repository.EpisodioRepository;

@Service
public class EpisodioService {
	
	@Autowired
	private EpisodioRepository repository;
	
	@Autowired
	private UsuarioRepository vendrepository;
	
	public List<EpisodioDTO> findAll() {
		List<Episodio>result = repository.findAll();
		return result.stream().map(x -> new 
		EpisodioDTO(x)).collect(Collectors.toList());
	}
	
	public Episodio findById(Long id) {
		Optional<Episodio> p = repository.findById(id);
		return p.get();
	}
	
	public Episodio save(Episodio Episodio) {
		Usuario Usuario = vendrepository.findById
		(Episodio.getUsuario().getId()).get();
		Episodio.setUsuario(Usuario);
		Episodio v = repository.save(Episodio);
		return v;
	}
	
	@Transactional
	public Episodio update(Long id,Episodio Episodio) {
		Episodio p = repository.getById(id);
		p.setId(id);
		p.setNome(Episodio.getNome());
		p.setDuracao(Episodio.getDuracao());
		p.setTemporada(Episodio.getTemporada());
		Episodio prod = repository.save(p);
		return prod;
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
