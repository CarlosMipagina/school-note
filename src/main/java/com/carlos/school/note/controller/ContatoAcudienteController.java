package com.carlos.school.note.controller;

import static com.carlos.school.note.utiliti.Constants.CONTATO_ACUDIENTE;
import static com.carlos.school.note.utiliti.Constants.CONTATO_ACUDIENTE_ID;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.school.note.entity.ContatoAcudienteEntity;
import com.carlos.school.note.services.ContatoAcudienteServices;

@RestController
@RequestMapping("/v1/api/")
public class ContatoAcudienteController {
	
	@Autowired
	public  ContatoAcudienteServices contatoAcudienteServices;
	
	@GetMapping(CONTATO_ACUDIENTE)
	public List<ContatoAcudienteEntity> getContatoAcudiente(){
		
		return contatoAcudienteServices.get();
	}
	
	@GetMapping(CONTATO_ACUDIENTE_ID)
	public  ContatoAcudienteEntity  getContatoAcudiente( @PathVariable  Integer id) {
		
		return contatoAcudienteServices.getId(id);
	}
	
	@PostMapping(CONTATO_ACUDIENTE)
	public  ResponseEntity<Object> addContatoAcudiente( @RequestBody ContatoAcudienteEntity contatoAcudiente){
		
		return  contatoAcudienteServices.add(contatoAcudiente);	
		
	}
	
	@PutMapping(CONTATO_ACUDIENTE_ID)
	public ResponseEntity<Object> updateContatoAcudiente(  @RequestBody ContatoAcudienteEntity contatoAcudiente, 
													@PathVariable Integer id){
		
		return  contatoAcudienteServices.update(contatoAcudiente, id);
	}
	
	public void  deleteContatoAcudiente( @PathVariable Integer id) {
		 contatoAcudienteServices.delete(id);
	}
	

}
