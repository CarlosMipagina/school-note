package com.carlos.school.note.controller;

import static com.carlos.school.note.utiliti.Constants.LICENCIA;
import static com.carlos.school.note.utiliti.Constants.LICENCIA_ID;

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

import com.carlos.school.note.entity.LicenciaEntity;
import com.carlos.school.note.services.LicenciaServices;


@RestController
@RequestMapping("/v1/api/")
public class LicenciaController {
	
	@Autowired
	public LicenciaServices licenciaServices;
	
	@GetMapping(LICENCIA)
	public List<LicenciaEntity> getLicencia(){
		
		return licenciaServices.get();
	}
	
	@GetMapping(LICENCIA_ID)
	public LicenciaEntity  getLicencia( @PathVariable  Integer id) {
		
		return licenciaServices.getId(id);
	}
	
	@PostMapping(LICENCIA)
	public  ResponseEntity<Object> addLicencia( @RequestBody LicenciaEntity licencia){
		
		return  licenciaServices.add(licencia);	
		
	}
	
	@PutMapping(LICENCIA_ID)
	public ResponseEntity<Object> updateLicencia(  @RequestBody LicenciaEntity licencia, 
													@PathVariable Integer id){
		
		return  licenciaServices.update(licencia, id);
	}
	
	public void  deleteLicencia( @PathVariable Integer id) {
		 licenciaServices.delete(id);
	}
}
