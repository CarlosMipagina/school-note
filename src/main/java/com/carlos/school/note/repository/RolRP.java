package com.carlos.school.note.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.school.note.entity.RolEntity;

@Repository
public interface RolRP   extends  JpaRepository<RolEntity, Integer> {
	
	//RolEntity  findByName( String  rol);

}
