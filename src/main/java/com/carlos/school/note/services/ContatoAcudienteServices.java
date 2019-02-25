package com.carlos.school.note.services;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.carlos.school.note.entity.ContatoAcudienteEntity;
import com.carlos.school.note.repository.ContatoAcudienteRP;

@Service("contatoAcudiente")
public class ContatoAcudienteServices {

		@Autowired
		public  ContatoAcudienteRP contatoAcudienteRP;
		 
		public  List<ContatoAcudienteEntity> get() {
				
				return contatoAcudienteRP.findAll();
		}

		public  ContatoAcudienteEntity  getId( int  id ) {
			
			Optional<ContatoAcudienteEntity> optional =  contatoAcudienteRP.findById(id);
			if(!optional.isPresent())
				return null;
			
			return  optional.get();
		}
		
		public  ResponseEntity<Object>  add( ContatoAcudienteEntity contatoAcudiente){
				
			ContatoAcudienteEntity  contatoAcudienteEntity  = contatoAcudienteRP.save(contatoAcudiente);
			
			URI  location  =  ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
								.buildAndExpand(contatoAcudienteEntity.getId()).toUri();
			
			return ResponseEntity.created(location).build();
		
		}
		
		public  ResponseEntity<Object>  update( ContatoAcudienteEntity  contatoAcudiente,  Integer  id){
			Optional  <ContatoAcudienteEntity>  optional  = contatoAcudienteRP.findById(id);
			
			if(!optional.isPresent())
				return  ResponseEntity.notFound().build();
			contatoAcudiente.setId(id);
			contatoAcudienteRP.save(contatoAcudiente);
			
			return  ResponseEntity.noContent().build();
		}
		
		public  void delete( Integer  id) {
			
			contatoAcudienteRP.deleteById(id);
		}
			
	 

}
