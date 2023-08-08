package com.example.demo.repository.modelo;

import java.time.LocalDate;
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
import jakarta.persistence.Transient;

@Entity
@Table(name = "factura")
public class Factura {

	@GeneratedValue(generator = "seq_factura",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_factura",sequenceName = "seq_factura", allocationSize = 1)
	@Id
	@Column(name="fact_id")		
	private Integer id;
	
	@Transient
	@Column(name="fact_fecha")	
	private LocalDate fecha;
	
	@Column(name="fact_total_factura")	
	private String totalFactura;
	
	//pk
	


	@OneToMany(mappedBy = "factura", cascade = CascadeType.ALL)
	private List<Factura> factura;

	//set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getTotalFactura() {
		return totalFactura;
	}

	public void setTotalFactura(String totalFactura) {
		this.totalFactura = totalFactura;
	}

	public List<Factura> getFactura() {
		return factura;
	}

	public void setFactura(List<Factura> factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", fecha=" + fecha + ", totalFactura=" + totalFactura + "]";
	}	
	
	
	
}
