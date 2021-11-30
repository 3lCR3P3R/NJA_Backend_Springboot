package com.nja.util;

public class UsuarioUtil {
	
	private Integer id;
	private String usuario;
	private String password;
	private String correo;
	private String telefono;
	private Integer rol;
	private String activo;
	private String token;
	
		
	public UsuarioUtil() {
		super();
	}


	public UsuarioUtil(Integer id, String usuario, String password, String correo, String telefono, Integer rol, String activo, String token) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.correo = correo;
		this.telefono = telefono;
		this.rol = rol;
		this.activo = activo;
		this.token = token;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public Integer getRol() {
		return rol;
	}


	public void setRol(Integer rol) {
		this.rol = rol;
	}


	public String getActivo() {
		return activo;
	}


	public void setActivo(String activo) {
		this.activo = activo;
	}


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}

}
