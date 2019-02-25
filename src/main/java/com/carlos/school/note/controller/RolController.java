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

import com.carlos.school.note.entity.RolEntity;
import com.carlos.school.note.services.RolServices;
import static com.carlos.school.note.utiliti.Constants.ROL;
import static com.carlos.school.note.utiliti.Constants.ROL_ID;

@RestController
@RequestMapping("/v1/api/")
public class RolController {

	@Autowired
	private  RolServices rolServices;
	
	
	@GetMapping(ROL)
	public  List<RolEntity> getRoles(){
		return  rolServices.get();
	}
	
	@GetMapping(ROL_ID)
	public  RolEntity  getRol( @PathVariable  int id) {
		
		return  rolServices.getId(id);
			
	}
	
	@PostMapping(ROL)
	public ResponseEntity<Object> addRol( @RequestBody RolEntity rol){
		return rolServices.add(rol);
	}
	
	@PutMapping(ROL_ID)
	public  ResponseEntity<Object> updateRol( @RequestBody RolEntity rol, 
													@PathVariable int  id){
		return  rolServices.update(rol, id);
	}
	
	@DeleteMapping(ROL_ID)
	public  void deleteRol( @PathVariable int  id){
		rolServices.delete(id);
	}
}
