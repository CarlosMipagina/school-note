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
@Table(name="SysContatoAcudiente")
public class ContatoAcudienteEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  int  id;
	
	@Column
	private  String  dirreccion;
	
	@Column
	private String email;
	
	@Column
	private String telefono;
	
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
	
	@JoinColumn(name="fk_id_cudiente_contato")
	@ManyToOne
	private  AcudienteEntity acudienteEntity;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDirreccion() {
		return dirreccion;
	}

	public void setDirreccion(String dirreccion) {
		this.dirreccion = dirreccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
