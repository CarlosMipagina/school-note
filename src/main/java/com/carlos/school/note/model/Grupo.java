package com.carlos.school.note.model;

public class Grupo {
	
	
	private  int  id;
	
	private  String nombre;
	
	private  String  descripcion;
	
	private  boolean active;
	
	private  String  createBy;
	
	private  String  createDt;
	
	private  String  updateBy;
	
	private  String  upadateDt;

	public Grupo(int id, String nombre, String descripcion, boolean active, String createBy, String createDt,
			String updateBy, String upadateDt) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.active = active;
		this.createBy = createBy;
		this.createDt = createDt;
		this.updateBy = updateBy;
		this.upadateDt = upadateDt;
	}

	public Grupo() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
