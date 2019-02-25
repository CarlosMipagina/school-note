package com.carlos.school.note.entity;

import java.time.LocalDate;

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
@Table(name="SysLicencia")
public class LicenciaEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
    private  int  id;
	
	@Column
	private  String  codigo;
	
	@JsonFormat( pattern="yyyy-mm-dd", shape=Shape.STRING)
	@Column(name="fecha_vencimiento")
	private  LocalDate FechaVencimiento;
    
	@Column
	private  boolean active;
	
	@Column
	private  String  createBy;
	
	@JsonFormat(pattern="yyyy-mm-dd",shape=Shape.STRING)
	@Column
	private  String  createDt;
	
	@Column
	private  String  updateBy;
	
	@Column
	@JsonFormat(pattern="yyyy-mm-dd",shape=Shape.STRING)
	private  String  upadateDt;
	
	@JoinColumn(name="fk_id_usuario")
	@ManyToOne
	private  UsuarioEntity usuarioEntity;

	
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

	public LocalDate getFechaVencimiento() {
		return FechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		FechaVencimiento = fechaVencimiento;
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
