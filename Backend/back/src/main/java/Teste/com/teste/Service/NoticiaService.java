package Teste.com.teste.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Teste.com.teste.DTO.NoticiaDTO;
import Teste.com.teste.Model.Noticia;
import Teste.com.teste.Repository.NoticiaRepository;

@Service
public class NoticiaService {
	
	@Autowired
	private NoticiaRepository repository;
	
	public List<NoticiaDTO> findAll() {
		List<Noticia> result = repository.findAll();
		return result.stream().map(x -> new
		NoticiaDTO(x)).collect(Collectors.toList());
	}
	
	public Noticia findById(Long id) {
		Optional<Noticia> v = repository.findById(id);
		return v.get();
	}
	
	public Noticia save(Noticia Noticia) {
		Noticia v = repository.save(Noticia);
		return v;
	}
	
	@Transactional
	public Noticia update(Long id,Noticia Noticia) {
		Noticia v = repository.getById(id);
		v.setId(id); 
		v.setNome(Noticia.getNome());
		v.setData(Noticia.getData());
		v.setConteudo(Noticia.getConteudo());
		Noticia vendpt = repository.save(v);
		return vendpt;
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
