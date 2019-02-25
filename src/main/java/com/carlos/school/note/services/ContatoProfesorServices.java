package com.carlos.school.note.services;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.carlos.school.note.entity.ContatoProfesorEntity;
import com.carlos.school.note.repository.ContatoProfesorRP;

@Service("contatoProfesroServices")
public class ContatoProfesorServices {
	
	@Autowired
	private  ContatoProfesorRP contatoProfesorRP;
	
	
	public  List<ContatoProfesorEntity> get() {
		
		return contatoProfesorRP.findAll();
	}
	
	public  ContatoProfesorEntity  getId( int  id ) {
		
		Optional<ContatoProfesorEntity> optional =  contatoProfesorRP.findById(id);
		if(!optional.isPresent())
			return null;
		
		return  optional.get();
	}
	
	public  ResponseEntity<Object>  add( ContatoProfesorEntity conatoProfesor){
			
		ContatoProfesorEntity  contatoProfesorEntity  = contatoProfesorRP.save(conatoProfesor);
		
		URI  location  =  ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
							.buildAndExpand(contatoProfesorEntity.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	
	}
	
	public  ResponseEntity<Object>  update( ContatoProfesorEntity  conatoProfesor,  Integer  id){
		Optional  <ContatoProfesorEntity>  optional  = contatoProfesorRP.findById(id);
		
		if(!optional.isPresent())
			return  ResponseEntity.notFound().build();
		conatoProfesor.setId(id);
		contatoProfesorRP.save(conatoProfesor);
		
		return  ResponseEntity.noContent().build();
	}
	
	public  void delete( Integer  id) {
		
		contatoProfesorRP.deleteById(id);
	}

}
