package com.carlos.school.note.controller;

import static com.carlos.school.note.utiliti.Constants.MATERIA;
import static com.carlos.school.note.utiliti.Constants.MATERIA_ID;

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

import com.carlos.school.note.entity.MateriaEntity;
import com.carlos.school.note.services.MateriaServices;

@RestController
@RequestMapping("/v1/api/")
public class MateriaController {
	
	@Autowired
	public MateriaServices materiaServices;
	
	@GetMapping(MATERIA)
	public List<MateriaEntity> getMateria(){
		
		return materiaServices.get();
	}
	
	@GetMapping(MATERIA_ID)
	public MateriaEntity  getMateria( @PathVariable  Integer id) {
		
		return materiaServices.getId(id);
	}
	
	@PostMapping(MATERIA)
	public  ResponseEntity<Object> addMateria( @RequestBody MateriaEntity materia){
		
		return  materiaServices.add(materia);	
		
	}
	
	@PutMapping(MATERIA_ID)
	public ResponseEntity<Object> updateMateria(  @RequestBody MateriaEntity materia, 
													@PathVariable Integer id){
		
		return  materiaServices.update(materia, id);
	}
	
	public void  deleteMateria( @PathVariable Integer id) {
		 materiaServices.delete(id);
	}

}
