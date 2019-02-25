package com.carlos.school.note.services;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.carlos.school.note.entity.AlumnoEntity;
import com.carlos.school.note.repository.AlumnoRP;

@Service("alumnosServices")
public class AlumnoServices {
	
	@Autowired
	private   AlumnoRP alumnoRP;
	
	public  List<AlumnoEntity> get() {
		
		return alumnoRP.findAll();
	}

	public  AlumnoEntity  getId( int  id ) {
		
		Optional<AlumnoEntity> optional =  alumnoRP.findById(id);
		if(!optional.isPresent())
			return null;
		
		return  optional.get();
	}
	
	public  ResponseEntity<Object>  add( AlumnoEntity alumno){
			
		AlumnoEntity  alumnoEntity  = alumnoRP.save(alumno);
		
		URI  location  =  ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
							.buildAndExpand(alumnoEntity.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	
	}
	
	public  ResponseEntity<Object>  update( AlumnoEntity  alumno,  Integer  id){
		Optional  <AlumnoEntity>  optional  = alumnoRP.findById(id);
		
		if(!optional.isPresent())
			return  ResponseEntity.notFound().build();
		alumno.setId(id);
		alumnoRP.save(alumno);
		
		return  ResponseEntity.noContent().build();
	}
	
	public  void delete( Integer  id) {
		
		alumnoRP.deleteById(id);
	}
	
	

}
