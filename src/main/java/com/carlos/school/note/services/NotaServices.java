package com.carlos.school.note.services;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.carlos.school.note.entity.NotaEntity;
import com.carlos.school.note.repository.NotaRP;

@Service
public class NotaServices {

	@Autowired
	private  NotaRP notaRP;
	
	public  List<NotaEntity> get() {
		
		return notaRP.findAll();
	}
	
	public  NotaEntity  getId( int  id ) {
		
		Optional<NotaEntity> optional =  notaRP.findById(id);
		if(!optional.isPresent())
			return null;
		
		return  optional.get();
	}
	
	public  ResponseEntity<Object>  add( NotaEntity nota){
			
		NotaEntity  notaEntity  = notaRP.save(nota);
		
		URI  location  =  ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
							.buildAndExpand(notaEntity.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	
	}
	
	public  ResponseEntity<Object>  update( NotaEntity  nota,  Integer  id){
		Optional  <NotaEntity>  optional  = notaRP.findById(id);
		
		if(!optional.isPresent())
			return  ResponseEntity.notFound().build();
		nota.setId(id);
		notaRP.save(nota);
		
		return  ResponseEntity.noContent().build();
	}
	
	public  void delete( Integer  id) {
		
		notaRP.deleteById(id);
	}

}
