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
@Table(name="SysAlumnos")
public class AlumnoEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  int  id;
	
	@Column
	private  String  nombre;
	
	@Column
	private  String  apellido;
	
	@Column
	private  String  identificacion;
	
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
	
	@JoinColumn(name="fk_id_grupo_alumno")
	@ManyToOne
	private  GrupoEntity grupoEntity;
	
	@JoinColumn(name="fk_id_acudiente_alumno")
	@ManyToOne
	private  AcudienteEntity acudienteEntity;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
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
