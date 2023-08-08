package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_factura")
public class DetalleFactura {

	
	@GeneratedValue(generator = "seq_detalle_factura",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_detalle_factura",sequenceName = "seq_detalle_factura", allocationSize = 1)
	@Id
	@Column(name="dtft_id")
	private Integer id;
	
	@Column(name="dtft_cantidad")
	private String cantidad;
	
	@Column(name="dtft_precio_unitario")
	private BigDecimal precioUnitario;
	
	@Column(name="dtft_sub_total")
	private Integer subTotal;

	@ManyToOne()
	@JoinColumn(name = "dtft_id_factura")
	private Factura factura;

	@ManyToOne()
	@JoinColumn(name = "dtft_id_producto")
	private Producto producto;

	//set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Integer getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Integer subTotal) {
		this.subTotal = subTotal;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "DetalleFactura [id=" + id + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario
				+ ", subTotal=" + subTotal + "]";
	}
	
	
	
}
