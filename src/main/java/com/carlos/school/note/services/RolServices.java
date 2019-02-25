package com.carlos.school.note.services;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.carlos.school.note.entity.RolEntity;
import com.carlos.school.note.repository.RolRP;

@Service("rolServices")
public class RolServices {
	
	@Autowired
	private   RolRP rolRP;
	
	public  List<RolEntity>  get(){
		
		return rolRP.findAll();
	}
	
	public RolEntity getId( int id){
		
		 Optional<RolEntity> optional =  rolRP.findById(id);
		 if(!optional.isPresent())
			 return null;
		 return  optional.get();
	}
	
	public ResponseEntity<Object> add( RolEntity rol){
		RolEntity rolEntity = rolRP.save(rol);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
			.buildAndExpand(rolEntity.getId()).toUri();
		
		return  ResponseEntity.created(location).build();
	}
	
	
	public  ResponseEntity<Object> update( RolEntity rol,int  id){
		
		Optional<RolEntity> optional =  rolRP.findById(id);
		if( !optional.isPresent())
			return ResponseEntity.notFound().build();
		
		rol.setId(id);
		rolRP.save(rol);
		
		return  ResponseEntity.noContent().build();
		
	}
	
	public  void  delete( int  id ) {
		rolRP.deleteById(id);
	}

}
