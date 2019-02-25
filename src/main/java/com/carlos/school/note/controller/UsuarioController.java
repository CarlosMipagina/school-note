package com.carlos.school.note.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.school.note.entity.UsuarioEntity;
import com.carlos.school.note.services.UsuarioServices;
import static com.carlos.school.note.utiliti.Constants.USUARIO;
import static com.carlos.school.note.utiliti.Constants.USUARIO_ID;

@RestController
@RequestMapping("/v1/api/")
public class UsuarioController {
	
	@Autowired
	private UsuarioServices usuarioServices;
	
	
	@PostMapping("logind")
	public UsuarioEntity login( @RequestBody UsuarioEntity usuario,  String  username, String password ) {
		System.out.println(username+password);
		return usuarioServices.login(usuario,username,password);
	}
	
	@GetMapping(USUARIO)
	public  List<UsuarioEntity> getUsuarios(){
		return  usuarioServices.get();
	}
	
	@GetMapping(USUARIO_ID)
	public  UsuarioEntity  getUsuario( @PathVariable  int id) {
		
		return  usuarioServices.getId(id);
			
	}
	
	@PostMapping("signUp")
	public ResponseEntity<Object> addUsuario( @RequestBody UsuarioEntity usuario){
		System.out.println( usuario);
		return usuarioServices.add(usuario);
	}
	
	@PutMapping(USUARIO_ID)
	public  ResponseEntity<Object> updateUsuario( @RequestBody UsuarioEntity usuario, 
													@PathVariable int  id){
		return  usuarioServices.update(usuario, id);
	}
	
	@DeleteMapping(USUARIO_ID)
	public  void deleteUsuario( @PathVariable int  id){
		usuarioServices.delete(id);
	}
	
	

}
