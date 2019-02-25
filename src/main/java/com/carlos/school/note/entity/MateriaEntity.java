package com.carlos.school.note.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name="SysMateria")
public class MateriaEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private  String codigo;
	
	@Column
	private  String nombre;
	
	@Column
	private  boolean active;
	
	@Column
	private  String  createBy;
	
	@JsonFormat( pattern="yyyy-mm-dd",shape=Shape.STRING)
	@Column
	private  String  createDt;
	
	@Column
	private  String updateBy;
	
	@JsonFormat( pattern="yyyy-mm-dd",shape=Shape.STRING)
	@Column
	private  String  upadateDt;
	
	@JoinColumn(name="fk_id_alumno_materia")
	@ManyToOne
	private AlumnoEntity  alumnoEntity;
	
	@JoinColumn(name="fk_id_profesor_materia")
	@ManyToOne
	private  ProfesorEntity profesorEntity;
	
	@JoinColumn(name="fk_id_nota_materia")
	@ManyToOne
	private  NotaEntity  notaEntity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreateDt() {
		return createDt;
	}

	public void setCreateDt(String createDt) {
		this.createDt = createDt;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getUpadateDt() {
		return upadateDt;
	}

	public void setUpadateDt(String upadateDt) {
		this.upadateDt = upadateDt;
	}

	
}
