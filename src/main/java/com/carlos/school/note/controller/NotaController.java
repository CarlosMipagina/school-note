package com.carlos.school.note.controller;

import static com.carlos.school.note.utiliti.Constants.NOTA;
import static com.carlos.school.note.utiliti.Constants.NOTA_ID;

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
public class NotaController {
	
	@Autowired
	public MateriaServices notaServices;
	
	@GetMapping(NOTA)
	public List<MateriaEntity> getMateria(){
		
		return notaServices.get();
	}
	
	@GetMapping(NOTA_ID)
	public MateriaEntity  getMateria( @PathVariable  Integer id) {
		
		return notaServices.getId(id);
	}
	
	@PostMapping(NOTA)
	public  ResponseEntity<Object> addMateria( @RequestBody MateriaEntity nota){
		
		return  notaServices.add(nota);	
		
	}
	
	@PutMapping(NOTA_ID)
	public ResponseEntity<Object> updateMateria(  @RequestBody MateriaEntity nota, 
													@PathVariable Integer id){
		
		return  notaServices.update(nota, id);
	}
	
	public void  deleteMateria( @PathVariable Integer id) {
		 notaServices.delete(id);
	}

}
