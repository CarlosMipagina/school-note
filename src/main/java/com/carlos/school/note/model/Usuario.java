package com.carlos.school.note.model;

public class Usuario {
	
	private  int  id;
	
	private  String  email;
	
	private  String password;
    
	private  boolean active;
	
	private  String  createBy;
	
	private  String  createDt;
	
	private  String  updateBy;
	
	private  String  upadateDt;
	
	private  String FKLicencia;
	
	private  String  FkRol;
	
	

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getFKLicencia() {
		return FKLicencia;
	}

	public void setFKLicencia(String fKLicencia) {
		FKLicencia = fKLicencia;
	}

	public String getFkRol() {
		return FkRol;
	}

	public void setFkRol(String fkRol) {
		FkRol = fkRol;
	}
	
	

}
