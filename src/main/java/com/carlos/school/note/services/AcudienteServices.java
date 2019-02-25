package com.carlos.school.note.services;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.carlos.school.note.entity.AcudienteEntity;
import com.carlos.school.note.repository.AcudienteRP;

@Service("acudienteServices")
public class AcudienteServices {
	
	@Autowired
	private  AcudienteRP  acudienteRP;
	
	
	public  List<AcudienteEntity> get() {
		
		return acudienteRP.findAll();
	}
	
	public  AcudienteEntity  getId( int  id ) {
		
		Optional<AcudienteEntity> optional =  acudienteRP.findById(id);
		if(!optional.isPresent())
			return null;
		
		return  optional.get();
	}
	
	public  ResponseEntity<Object>  add( AcudienteEntity acudiente){
			
		AcudienteEntity  acudienteEntity  = acudienteRP.save(acudiente);
		
		URI  location  =  ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
							.buildAndExpand(acudienteEntity.getId()).toUri();
		
		return ResponseEntity.created(location).build();

	}
	
	public  ResponseEntity<Object>  update( AcudienteEntity  acudiente,  Integer  id){
		Optional  <AcudienteEntity>  optional  = acudienteRP.findById(id);
		
		if(!optional.isPresent())
			return  ResponseEntity.notFound().build();
		acudiente.setId(id);
		acudienteRP.save(acudiente);
		
		return  ResponseEntity.noContent().build();
	}
	
	public  void delete( Integer  id) {
		
		acudienteRP.deleteById(id);
	}
}
