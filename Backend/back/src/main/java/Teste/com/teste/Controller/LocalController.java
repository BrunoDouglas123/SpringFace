package Teste.com.teste.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Teste.com.teste.DTO.LocalDTO;
import Teste.com.teste.Model.Local;
import Teste.com.teste.Repository.LocalRepository;
import Teste.com.teste.Service.LocalService;

@RestController
@RequestMapping(value = "/locais")
public class LocalController {
	
	@Autowired
	private LocalRepository repository;

	@Autowired
	private LocalService service;
	
	@GetMapping
	public ResponseEntity<List<LocalDTO>> findAll() throws Exception {
		try {
			System.out.println("List of Locals:");
			List<LocalDTO> list = service.findAll();
			return ResponseEntity.ok(list);
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@GetMapping(value = "/page")
	public ResponseEntity<Page<Local>> findAll(
			@PageableDefault(page = 0,
								size = 10,
									sort = "id",
										direction = Sort.Direction.ASC)Pageable page) throws Exception {
		try { Page<Local> list = repository.findAll(page);
			return ResponseEntity.ok(list);
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<LocalDTO> findById(@PathVariable Long id) throws Exception {
		try {
			System.out.println("Local: " + id);
			LocalDTO v = new LocalDTO(service.findById(id));
			return ResponseEntity.ok(v);
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@PostMapping
	public ResponseEntity<Local> save(@RequestBody Local Local) throws Exception {
		try {
			Local save = service.save(Local);
			System.out.println("New Local Saved Sucessfully.");
			return new ResponseEntity<>(save, null, HttpStatus.CREATED);
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Local> update(@PathVariable Long id,@RequestBody Local Local) throws Exception {
		try {
		System.out.println("Local " + id + " Updated Sucessfully.");
		return ResponseEntity.ok(service.update(id, Local));
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) throws Exception {
		try {
			System.out.println("Local " + id + " Deleted Sucessfully.");
			service.delete(id);
			return ResponseEntity.ok().build();
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
}
