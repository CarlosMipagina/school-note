package com.carlos.school.note.controller;

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

import com.carlos.school.note.entity.AcudienteEntity;
import com.carlos.school.note.services.AcudienteServices;
import static com.carlos.school.note.utiliti.Constants.ACUDIENTE;
import static com.carlos.school.note.utiliti.Constants.ACUDIENTE_ID;


@RestController
@RequestMapping("/v1/api/")
public class AcudienteController {
	
	
	
	@Autowired
	public  AcudienteServices acudienteServices;
	
	@GetMapping(ACUDIENTE)
	public List<AcudienteEntity> getAcudientes(){
		
		return acudienteServices.get();
	}
	
	@GetMapping(ACUDIENTE_ID)
	public  AcudienteEntity  getAcudiente( @PathVariable  Integer id) {
		
		return acudienteServices.getId(id);
	}
	
	@PostMapping(ACUDIENTE)
	public  ResponseEntity<Object> addAcudiente( @RequestBody AcudienteEntity acudiente){
		
		return  acudienteServices.add(acudiente);	
		
	}
	
	@PutMapping(ACUDIENTE_ID)
	public ResponseEntity<Object> updateAcudiente(  @RequestBody AcudienteEntity acudiente, 
													@PathVariable Integer id){
		
		return  acudienteServices.update(acudiente, id);
	}
	
	public void  deleteAcudiente( @PathVariable Integer id) {
		 acudienteServices.delete(id);
	}
	
	
	
}
