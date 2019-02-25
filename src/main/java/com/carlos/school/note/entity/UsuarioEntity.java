package com.carlos.school.note.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name="SysUsuario")
public class UsuarioEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  int  id;
	
	@Column(unique=true)
	private  String  userName;
	
	@Transient
	private  String  token;
	
	@JsonProperty(access=Access.WRITE_ONLY)
	@Column
	private  String password;
    
	@JsonProperty(access=Access.WRITE_ONLY)
	@Column
	private  boolean active;
	
	@JsonProperty(access=Access.WRITE_ONLY)
	@Column
	private  String  createBy;
	
	@JsonProperty(access=Access.WRITE_ONLY)
	@JsonFormat(pattern="yyyy-mm-dd",shape=Shape.STRING)
	@Column
	private  String  createDt;
	
	@JsonProperty(access=Access.WRITE_ONLY)
	@Column
	private  String  updateBy;
	
	@Transient
	private int  idRol;
	
	@JsonProperty(access=Access.WRITE_ONLY)
	@JsonFormat(pattern="yyyy-mm-dd",shape=Shape.STRING)
	@Column
	private  String  upadateDt;
	
	

	@JoinColumn(name="fk_id_rol_usuario")
	@ManyToOne
	private  RolEntity  rolEntity;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
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
	
	

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public RolEntity getRolEntity() {
		return rolEntity;
	}

	public void setRolEntity(RolEntity rolEntity) {
		this.rolEntity = rolEntity;
	}
	
	
}
