package com.carlos.school.note.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.school.note.entity.AlumnoEntity;
import com.carlos.school.note.services.AlumnoServices;


import static com.carlos.school.note.utiliti.Constants.ALUMNO;
import static com.carlos.school.note.utiliti.Constants.ALUMNO_ID;

import java.util.List;

@RestController
@RequestMapping("/v1/api/")
public class AlumnoController {
	
	@Autowired
	public  AlumnoServices alumnoServices;
	
	@GetMapping(ALUMNO)
	public List<AlumnoEntity> getAlumno(){
		
		return alumnoServices.get();
	}
	
	@GetMapping(ALUMNO_ID)
	public  AlumnoEntity  getAlumno( @PathVariable  Integer id) {
		
		return alumnoServices.getId(id);
	}
	
	@PostMapping(ALUMNO)
	public  ResponseEntity<Object> addAlumno( @RequestBody AlumnoEntity alumno){
		
		return  alumnoServices.add(alumno);	
		
	}
	
	@PutMapping(ALUMNO_ID)
	public ResponseEntity<Object> updateAlumno(  @RequestBody AlumnoEntity alumno, 
													@PathVariable Integer id){
		
		return  alumnoServices.update(alumno, id);
	}
	
	public void  deleteAlumno( @PathVariable Integer id) {
		 alumnoServices.delete(id);
	}
	
	

}
