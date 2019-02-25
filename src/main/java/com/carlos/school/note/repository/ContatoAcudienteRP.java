package com.carlos.school.note.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.school.note.entity.ContatoAcudienteEntity;

@Repository
public interface ContatoAcudienteRP  extends  JpaRepository<ContatoAcudienteEntity, Integer>{

}
