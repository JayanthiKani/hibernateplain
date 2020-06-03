package com.example.demo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class QueryJPAController {
	
	
	
	@Autowired
	private QueryJPARepository queryJPARepository;
	
	@GetMapping("/users/jpa/getAll")
	public List<queryBean> getAllRecords() {
		
		return queryJPARepository.findAll();
		
	}
	
	
	@GetMapping("/users/jpa/getAll/{id}")
	public queryBean getSpeficRecord(@PathVariable long id) {
		
		return queryJPARepository.findByQueryId(id);
		
		
		
	}
	
	
	
	@PutMapping("/users/jpa/{id}")
	public ResponseEntity<queryBean> updateRecord(@PathVariable long id,@RequestBody queryBean pathBean) {
		
		 queryBean quBean = queryJPARepository.save(pathBean);
		 return new ResponseEntity<queryBean>(quBean,HttpStatus.OK);
	}
	
	
	@PostMapping("/users/jpa")
	public ResponseEntity<queryBean> createRecord(@RequestBody queryBean pathBean) {
		
		 queryBean quBean = queryJPARepository.save(pathBean);
		 
		 URI uri=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(quBean.getQueryId()).toUri();
		 
		 return  ResponseEntity.created(uri).build();
	}
	
	
	
	@DeleteMapping("/users/jpa/{id}")
	public ResponseEntity<Void> deleteQuery(@PathVariable long id) {
		
		  queryJPARepository.deleteByQueryId(id);
		
		return ResponseEntity.noContent().build();
		
		
	}


}
