package com.carlos.school.note.controller;

import static com.carlos.school.note.utiliti.Constants.CONTATO_PROFESOR;
import static com.carlos.school.note.utiliti.Constants.CONTATO_PROFESOR_ID;

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

import com.carlos.school.note.entity.ContatoProfesorEntity;
import com.carlos.school.note.services.ContatoProfesorServices;

@RestController
@RequestMapping("/v1/api/")
public class ContatoProfesorController {
	
	@Autowired
	public  ContatoProfesorServices contatoProfesorServices;
	
	@GetMapping(CONTATO_PROFESOR)
	public List<ContatoProfesorEntity> getContatoProfesor(){
		
		return contatoProfesorServices.get();
	}
	
	@GetMapping(CONTATO_PROFESOR_ID)
	public  ContatoProfesorEntity  getContatoProfesor( @PathVariable  Integer id) {
		
		return contatoProfesorServices.getId(id);
	}
	
	@PostMapping(CONTATO_PROFESOR)
	public  ResponseEntity<Object> addContatoProfesor( @RequestBody ContatoProfesorEntity contatoProfesor){
		
		return  contatoProfesorServices.add(contatoProfesor);	
		
	}
	
	@PutMapping(CONTATO_PROFESOR_ID)
	public ResponseEntity<Object> updateContatoProfesor(  @RequestBody ContatoProfesorEntity contatoProfesor, 
													@PathVariable Integer id){
		
		return  contatoProfesorServices.update(contatoProfesor, id);
	}
	
	public void  deleteContatoProfesor( @PathVariable Integer id) {
		 contatoProfesorServices.delete(id);
	}
}
