package com.carlos.school.note.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.school.note.entity.UsuarioEntity;

@Repository
public interface UsuarioRP  extends  JpaRepository<UsuarioEntity, Integer>{
	
	UsuarioEntity  findByuserNameAndPassword(String  username, String  password );
	UsuarioEntity  findBypassword(String password );
	UsuarioEntity  findByUserName( String username);
}
