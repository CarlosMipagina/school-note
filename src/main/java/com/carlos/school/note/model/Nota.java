package com.carlos.school.note.model;

public class Nota {
	
	private  int  id;
	
	private  int  valor;
	
	private  String  descripcion;
	
	private  boolean active;
	
	private  String  createBy;
	
	private  String  createDt;
	
	private  String  updateBy;
	
	private  String  upadateDt;
	

	public Nota(int id, int valor, String descripcion) {
		super();
		this.id = id;
		this.valor = valor;
		this.descripcion = descripcion;
	}

	public Nota() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
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
