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

	@Column(name = "of_nombre")
	private String nombre;
	
	@Column(name = "of_marca")
    private String marca;
	
	@Column(name = "of_color")
    private String color;
	
	@Column(name = "of_descuento")
	private Integer descuento;

	@Column(name = "of_precio")
	private Double precio;

	@Column(name = "of_precio_descuento")
	private Double precioDescuento;
	
	@Column(name = "of_categoria")
    private String categoria;

	@Column(name = "of_cantidad")
	private Integer cantidad;

	@Column(name = "of_fecha_maxima")
	private Date fechaMaxima;

	@Column(name = "of_imagen")
	private String imagen;
	
	@Column(name = "of_descripcion")
    private String descripcion;

	@Column(name = "of_activo")
	private String activo;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getDescuento() {
		return descuento;
	}

	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getPrecioDescuento() {
		return precioDescuento;
	}

	public void setPrecioDescuento(Double precioDescuento) {
		this.precioDescuento = precioDescuento;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaMaxima() {
		return fechaMaxima;
	}

	public void setFechaMaxima(Date fechaMaxima) {
		this.fechaMaxima = fechaMaxima;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}
}
