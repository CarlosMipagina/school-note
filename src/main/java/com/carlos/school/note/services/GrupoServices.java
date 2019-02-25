package com.carlos.school.note.services;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.carlos.school.note.entity.GrupoEntity;
import com.carlos.school.note.repository.GrupoRP;

@Service("grupoServices")
public class GrupoServices {
	 
	@Autowired
	private  GrupoRP grupoRP;
	
	public  List<GrupoEntity> get() {
		
		return grupoRP.findAll();
	}
	
	public  GrupoEntity  getId( int  id ) {
		
		Optional<GrupoEntity> optional =  grupoRP.findById(id);
		if(!optional.isPresent())
			return null;
		
		return  optional.get();
	}
	
	public  ResponseEntity<Object>  add( GrupoEntity grupo){
			
		GrupoEntity  grupoEntity  = grupoRP.save(grupo);
		
		URI  location  =  ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
							.buildAndExpand(grupoEntity.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	
	}
	
	public  ResponseEntity<Object>  update( GrupoEntity  grupo,  Integer  id){
		Optional  <GrupoEntity>  optional  = grupoRP.findById(id);
		
		if(!optional.isPresent())
			return  ResponseEntity.notFound().build();
		grupo.setId(id);
		grupoRP.save(grupo);
		
		return  ResponseEntity.noContent().build();
	}
	
	public  void delete( Integer  id) {
		
		grupoRP.deleteById(id);
	}

}
