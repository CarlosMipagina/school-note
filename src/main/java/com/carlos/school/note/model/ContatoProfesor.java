package com.carlos.school.note.model;

public class ContatoProfesor {

private  int  id;
	
	private  String  dirreccion;
	
	private String email;
	
	private String telefono;
	
	private  boolean active;
	
	private  String  createBy;
	
	private  String  createDt;
	
	private  String updateBy;
	
	private  String  upadateDt;
	
	private  Profesor profesor;
	
	
	public ContatoProfesor(int id, String dirreccion, String email, String telefono, boolean active, String createBy,
			String createDt, String updateBy, String upadateDt) {
		super();
		this.id = id;
		this.dirreccion = dirreccion;
		this.email = email;
		this.telefono = telefono;
		this.active = active;
		this.createBy = createBy;
		this.createDt = createDt;
		this.updateBy = updateBy;
		this.upadateDt = upadateDt;
	}

	public ContatoProfesor() {
		super();
		// TODO Auto-generated constructor stub
	}
	

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

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	
	

}
