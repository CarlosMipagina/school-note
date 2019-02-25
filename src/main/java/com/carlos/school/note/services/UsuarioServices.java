package com.carlos.school.note.services;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.carlos.school.note.entity.UsuarioEntity;
import com.carlos.school.note.repository.UsuarioRP;



@Service("usuarioServices")
public class UsuarioServices {

	@Autowired
	private  UsuarioRP usuarioRP;
	
	@Autowired
	private  RolServices  rolServices;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	 
	
	public List<UsuarioEntity> get(){
			
			return  usuarioRP.findAll();
	}
	
	public  UsuarioEntity login( UsuarioEntity usuario,String  username, String password) {
		
		@SuppressWarnings("unused")
		UsuarioEntity usuarioEntity   =  usuarioRP.findByuserNameAndPassword(username, password);
		
		return usuario ;
	}
	
	public UsuarioEntity  getId( int id) {
		
		Optional<UsuarioEntity> optional   =  usuarioRP.findById(id);
		
		if(!optional.isPresent())
			return null;
		return  optional.get();
	}
	
	public ResponseEntity<Object> add( UsuarioEntity usuario){
		
		usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
		usuario.setRolEntity(rolServices.getId(usuario.getIdRol()));
		usuario.setUpadateDt("");
		usuario.setUpdateBy("");
		
		UsuarioEntity usuarioEntity =  usuarioRP.save(usuario);
		
		URI  location  = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
				.buildAndExpand(usuarioEntity.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	
	public  ResponseEntity<Object> update( UsuarioEntity usuario, int id){
		
		Optional<UsuarioEntity> optional =  usuarioRP.findById(id);
		
		if(!optional.isPresent())
			return ResponseEntity.notFound().build();
		usuario.setId(id);
		usuarioRP.save(usuario);
		
		return ResponseEntity.noContent().build();
	
	}
	
	public void  delete( int id) {
		
		usuarioRP.deleteById(id);
	}
	
	
	
	
}
