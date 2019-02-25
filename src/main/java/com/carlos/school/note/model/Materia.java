package com.carlos.school.note.model;

public class Materia {

	private int id;
	
	private  String codigo;
	
	private  String nombre;
	
	private  boolean active;
	
	private  String  createBy;
	
	private  String  createDt;
	
	private  String  updateBy;
	
	private  String  upadateDt;
	
	private  Alumno alumno;
	
	private  Profesor profesor;
	
	private  Nota  nota;
	
	public Materia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Materia(int id, String codigo, String nombre, boolean active, String createBy, String createDt,
			String updateBy, String upadateDt, Alumno alumno, Profesor profesor, Nota nota) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.active = active;
		this.createBy = createBy;
		this.createDt = createDt;
		this.updateBy = updateBy;
		this.upadateDt = upadateDt;
		this.alumno = alumno;
		this.profesor = profesor;
		this.nota = nota;
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

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}
	
	
	
}
