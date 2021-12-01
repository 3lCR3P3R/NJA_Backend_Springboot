package com.nja.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ofertas")
public class Oferta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "of_id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "po_id")
	private Producto producto;
	
	@Column(name = "of_descuento")
	private Integer descuento;

	@Column(name = "of_precio_descuento")
	private Double precioDescuento;

	@Column(name = "of_fecha_maxima")
	private Date fechaMaxima;

	@Column(name = "of_activo")
	private String activo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getDescuento() {
		return descuento;
	}

	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}

	public Double getPrecioDescuento() {
		return precioDescuento;
	}

	public void setPrecioDescuento(Double precioDescuento) {
		this.precioDescuento = precioDescuento;
	}

	public Date getFechaMaxima() {
		return fechaMaxima;
	}

	public void setFechaMaxima(Date fechaMaxima) {
		this.fechaMaxima = fechaMaxima;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}
}
