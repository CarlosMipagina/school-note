package com.carlos.school.note.services;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.carlos.school.note.entity.MateriaEntity;
import com.carlos.school.note.repository.MateriaRP;

@Service("materiaServices")
public class MateriaServices {
	
	@Autowired
	private  MateriaRP materiaRP;
	
	public  List<MateriaEntity> get() {
			
			return materiaRP.findAll();
		}
	
	public  MateriaEntity  getId( int  id ) {
		
		Optional<MateriaEntity> optional =  materiaRP.findById(id);
		if(!optional.isPresent())
			return null;
		
		return  optional.get();
	}
	
	public  ResponseEntity<Object>  add( MateriaEntity materia){
			
		MateriaEntity  materiaEntity  = materiaRP.save(materia);
		
		URI  location  =  ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
							.buildAndExpand(materiaEntity.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	
	}
	
	public  ResponseEntity<Object>  update( MateriaEntity  materia,  Integer  id){
		Optional  <MateriaEntity>  optional  = materiaRP.findById(id);
		
		if(!optional.isPresent())
			return  ResponseEntity.notFound().build();
		materia.setId(id);
		materiaRP.save(materia);
		
		return  ResponseEntity.noContent().build();
	}
	
	public  void delete( Integer  id) {
		
		materiaRP.deleteById(id);
	}


}
