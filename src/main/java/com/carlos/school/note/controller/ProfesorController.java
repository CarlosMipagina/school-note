package com.carlos.school.note.controller;

import static com.carlos.school.note.utiliti.Constants.PROFESOR;
import static com.carlos.school.note.utiliti.Constants.PROFESOR_ID;

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

import com.carlos.school.note.entity.ProfesorEntity;
import com.carlos.school.note.services.ProfesorServices;

@RestController
@RequestMapping("/v1/api/")
public class ProfesorController {
	
	@Autowired
	public  ProfesorServices profesorServices;
	
	@GetMapping(PROFESOR)
	public List<ProfesorEntity> getProfesors(){
		
		return profesorServices.get();
	}
	
	@GetMapping(PROFESOR_ID)
	public  ProfesorEntity  getProfesor( @PathVariable  Integer id) {
		
		return profesorServices.getId(id);
	}
	
	@PostMapping(PROFESOR)
	public  ResponseEntity<Object> addProfesor( @RequestBody ProfesorEntity profesor){
		
		return  profesorServices.add(profesor);	
		
	}
	
	@PutMapping(PROFESOR_ID)
	public ResponseEntity<Object> updateProfesor(  @RequestBody ProfesorEntity profesor, 
													@PathVariable Integer id){
		
		return  profesorServices.update(profesor, id);
	}
	
	public void  deleteProfesor( @PathVariable Integer id) {
		 profesorServices.delete(id);
	}
	

}
