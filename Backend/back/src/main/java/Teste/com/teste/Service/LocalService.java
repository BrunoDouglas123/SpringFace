package Teste.com.teste.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Teste.com.teste.DTO.LocalDTO;
import Teste.com.teste.Model.Local;
import Teste.com.teste.Repository.LocalRepository;

@Service
public class LocalService {
	
	@Autowired
	private LocalRepository repository;
	
	public List<LocalDTO> findAll() {
		List<Local> result = repository.findAll();
		return result.stream().map(x -> new
		LocalDTO(x)).collect(Collectors.toList());
	}
	
	public Local findById(Long id) {
		Optional<Local> v = repository.findById(id);
		return v.get();
	}
	
	public Local save(Local Local) {
		Local v = repository.save(Local);
		return v;
	}
	
	@Transactional
	public Local update(Long id,Local Local) {
		Local v = repository.getById(id);
		v.setId(id); 
		v.setNome(Local.getNome());
		v.setRamo(Local.getRamo());
		v.setProprietario(Local.getProprietario());
		Local vendpt = repository.save(v);
		return vendpt;
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
