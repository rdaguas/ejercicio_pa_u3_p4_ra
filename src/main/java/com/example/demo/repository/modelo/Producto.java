package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	@GeneratedValue(generator = "seq_producto",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_producto",sequenceName = "seq_producto", allocationSize = 1)
	@Id
	@Column(name="prod_id")
	private Integer id;
	
	@Column(name="prod_codigo_barras")
	private String codigoBarras;
	
	@Column(name="prod_nombre")
	private String nombre;
	
	@Column(name="prod_categoria")
	private String categoria;
	
	@Column(name="prod_stock")
	private String stock;
	
	@Column(name="prod_precio")
	private BigDecimal precio;
	
	//pk
	@OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
	private List<Producto> producto;

	
	//set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", codigoBarras=" + codigoBarras + ", nombre=" + nombre + ", categoria="
				+ categoria + ", stock=" + stock + ", precio=" + precio + "]";
	}
	
	
	
	
}
