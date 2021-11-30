package com.nja.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contactenos")
public class Contacto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "co_id")
    private int id;
	
	@Column(name = "co_nombre")
    private String nombre;
	
	@Column(name = "co_email")
    private String email;
	
	@Column(name = "co_asunto")
    private String asunto;
	
	@Column(name = "co_mensaje")
    private String mensaje;
	
	@Column(name = "co_leido")
    private String leido;
	

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getLeido() {
		return leido;
	}

	public void setLeido(String leido) {
		this.leido = leido;
	}
}
