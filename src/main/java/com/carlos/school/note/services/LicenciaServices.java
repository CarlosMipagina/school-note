package com.carlos.school.note.services;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.carlos.school.note.entity.LicenciaEntity;
import com.carlos.school.note.repository.LicenciaRP;

@Service("licenciaServices")
public class LicenciaServices {
	
	@Autowired
	private  LicenciaRP licenciaRP;
	
	public  List<LicenciaEntity> get() {
		
		return licenciaRP.findAll();
	}
	
	public  LicenciaEntity  getId( int  id ) {
		
		Optional<LicenciaEntity> optional =  licenciaRP.findById(id);
		if(!optional.isPresent())
			return null;
		
		return  optional.get();
	}
	
	public  ResponseEntity<Object>  add( LicenciaEntity licencia){
			
		LicenciaEntity  licenciaEntity  = licenciaRP.save(licencia);
		
		URI  location  =  ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
							.buildAndExpand(licenciaEntity.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	
	}
	
	public  ResponseEntity<Object>  update( LicenciaEntity  licencia,  Integer  id){
		Optional  <LicenciaEntity>  optional  = licenciaRP.findById(id);
		
		if(!optional.isPresent())
			return  ResponseEntity.notFound().build();
		licencia.setId(id);
		licenciaRP.save(licencia);
		
		return  ResponseEntity.noContent().build();
	}
	
	public  void delete( Integer  id) {
		
		licenciaRP.deleteById(id);
	}

}
