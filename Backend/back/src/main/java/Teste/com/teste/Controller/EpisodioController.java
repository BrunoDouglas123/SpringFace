package Teste.com.teste.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import Teste.com.teste.DTO.EpisodioDTO;
import Teste.com.teste.Model.Episodio;
import Teste.com.teste.Repository.EpisodioRepository;
import Teste.com.teste.Service.EpisodioService;

public class EpisodioController {

	@Autowired
	private EpisodioRepository repository;
	
	@Autowired
	private EpisodioService service;
	
	@GetMapping
	public ResponseEntity<List<EpisodioDTO>> findAll() {
		System.out.println("List of Products:");
		List<EpisodioDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/page")
	public ResponseEntity<Page<Episodio>> findAll(Pageable pageable) {
		System.out.println("List of Products:");
		Page<Episodio> list = repository.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EpisodioDTO> findById(@PathVariable Long id) {
		System.out.println("Type: " + id);
		EpisodioDTO p = new EpisodioDTO(service.findById(id));
		return ResponseEntity.ok(p);
	}
	
	@PostMapping
	public ResponseEntity<EpisodioDTO> save(@RequestBody Episodio Episodio) {
		System.out.println("New Type Saved Sucessfully.");
		EpisodioDTO p = new EpisodioDTO(service.save(Episodio));
		return ResponseEntity.ok(p);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Episodio> update(@PathVariable Long id,@RequestBody Episodio Episodio) {
		System.out.println("Type " + id + " Updated Sucessfully.");
		return ResponseEntity.ok(service.update(id, Episodio));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		System.out.println("Type " + id + " Deleted Sucessfully.");
		service.delete(id);
		return ResponseEntity.ok().build();
	}
}
