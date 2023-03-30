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

import Teste.com.teste.DTO.TipoDTO;
import Teste.com.teste.Model.Tipo;
import Teste.com.teste.Repository.TipoRepository;
import Teste.com.teste.Service.TipoService;

public class TipoController {

	@Autowired
	private TipoRepository repository;
	
	@Autowired
	private TipoService service;
	
	@GetMapping
	public ResponseEntity<List<TipoDTO>> findAll() {
		System.out.println("List of Products:");
		List<TipoDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/page")
	public ResponseEntity<Page<Tipo>> findAll(Pageable pageable) {
		System.out.println("List of Products:");
		Page<Tipo> list = repository.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TipoDTO> findById(@PathVariable Long id) {
		System.out.println("Type: " + id);
		TipoDTO p = new TipoDTO(service.findById(id));
		return ResponseEntity.ok(p);
	}
	
	@PostMapping
	public ResponseEntity<TipoDTO> save(@RequestBody Tipo Tipo) {
		System.out.println("New Type Saved Sucessfully.");
		TipoDTO p = new TipoDTO(service.save(Tipo));
		return ResponseEntity.ok(p);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Tipo> update(@PathVariable Long id,@RequestBody Tipo Tipo) {
		System.out.println("Type " + id + " Updated Sucessfully.");
		return ResponseEntity.ok(service.update(id, Tipo));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		System.out.println("Type " + id + " Deleted Sucessfully.");
		service.delete(id);
		return ResponseEntity.ok().build();
	}
}
