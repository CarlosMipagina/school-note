package com.carlos.school.note.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.school.note.entity.GrupoEntity;


@Repository
public interface GrupoRP  extends JpaRepository<GrupoEntity,Integer>{

}
