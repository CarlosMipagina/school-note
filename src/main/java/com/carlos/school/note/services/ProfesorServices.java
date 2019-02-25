package com.carlos.school.note.services;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.carlos.school.note.entity.ProfesorEntity;
import com.carlos.school.note.repository.ProfesorRP;

@Service("profesorServices")
public class ProfesorServices {

	@Autowired
	private  ProfesorRP  profesorRP;
	
	public  List<ProfesorEntity> get() {
			
			return profesorRP.findAll();
		}
	
	public  ProfesorEntity  getId( int  id ) {
		
		Optional<ProfesorEntity> optional =  profesorRP.findById(id);
		if(!optional.isPresent())
			return null;
		
		return  optional.get();
	}
	
	public  ResponseEntity<Object>  add( ProfesorEntity profesor){
			
		ProfesorEntity  profesorEntity  = profesorRP.save(profesor);
		
		URI  location  =  ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
							.buildAndExpand(profesorEntity.getId()).toUri();
		
		return ResponseEntity.created(location).build();

	}
	
	public  ResponseEntity<Object>  update( ProfesorEntity  profesor,  Integer  id){
		Optional  <ProfesorEntity>  optional  = profesorRP.findById(id);
		
		if(!optional.isPresent())
			return  ResponseEntity.notFound().build();
		profesor.setId(id);
		profesorRP.save(profesor);
		
		return  ResponseEntity.noContent().build();
	}
	
	public  void delete( Integer  id) {
		
		profesorRP.deleteById(id);
	}
}
