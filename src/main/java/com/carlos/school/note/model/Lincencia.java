package com.carlos.school.note.model;

import java.time.LocalDate;

public class Lincencia {
	
	private  int  id;
	
	private  String  codigo;
	
	private  LocalDate FechaVencimiento;
    
	private  boolean active;
	
	private  String  createBy;
	
	private  String  createDt;
	
	private  String  updateBy;
	
	private  String  upadateDt;
	
	private  Usuario usuario;

	public Lincencia() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
