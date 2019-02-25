package com.carlos.school.note.controller;

import static com.carlos.school.note.utiliti.Constants.GRUPO;
import static com.carlos.school.note.utiliti.Constants.GRUPO_ID;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.school.note.entity.GrupoEntity;
import com.carlos.school.note.services.GrupoServices;

@RestController
@RequestMapping("/v1/api/")
public class GrupoController {
	
	@Autowired
	public  GrupoServices grupoServices;
	
	@GetMapping(GRUPO)
	public List<GrupoEntity> getGrupo(){
		
		return grupoServices.get();
	}
	
	@GetMapping(GRUPO_ID)
	public  GrupoEntity  getGrupo( @PathVariable  Integer id) {
		
		return grupoServices.getId(id);
	}
	
	@PostMapping(GRUPO)
	public  ResponseEntity<Object> addGrupo( @RequestBody GrupoEntity grupo){
		
		return  grupoServices.add(grupo);	
		
	}
	
	@PutMapping(GRUPO_ID)
	public ResponseEntity<Object> updateGrupo(  @RequestBody GrupoEntity grupo, 
													@PathVariable Integer id){
		
		return  grupoServices.update(grupo, id);
	}
	
	public void  deleteGrupo( @PathVariable Integer id) {
		 grupoServices.delete(id);
	}

}
