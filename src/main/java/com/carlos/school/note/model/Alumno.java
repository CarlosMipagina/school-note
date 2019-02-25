package com.carlos.school.note.model;

public class Alumno {
	
	

	private  int  id;
	
	private  String  nombre;
	
	private  String  apellido;
	
	private  String  identificacion;
	
	private  boolean active;
	
	private  String  createBy;
	
	private  String  createDt;
	
	private  String updateBy;
	
	private  String  upadateDt;

	private  Grupo grupo;
	
	private  Acudiente acudiente;
	
	public Alumno(int id, String nombre, String apellido, String identificacion, boolean active, String createBy,
			String createDt, String updateBy, String upadateDt) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = identificacion;
		this.active = active;
		this.createBy = createBy;
		this.createDt = createDt;
		this.updateBy = updateBy;
		this.upadateDt = upadateDt;
	}
	
	public Alumno() {
		super();
		
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

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Acudiente getAcudiente() {
		return acudiente;
	}

	public void setAcudiente(Acudiente acudiente) {
		this.acudiente = acudiente;
	}
	
	
	
}
