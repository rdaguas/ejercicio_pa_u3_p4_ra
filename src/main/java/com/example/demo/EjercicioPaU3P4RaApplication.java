package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.DetalleFactura;
import com.example.demo.repository.modelo.Producto;
import com.example.demo.service.IFacturaService;
import com.example.demo.service.IProductoService;

@SpringBootApplication
public class EjercicioPaU3P4RaApplication implements CommandLineRunner{

	@Autowired
	private IProductoService productoService;
	
	@Autowired
	private IFacturaService facturaService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU3P4RaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		DetalleFactura df = new DetalleFactura();
		df.setCantidad("1");
		Producto prod = new Producto();
		prod.setCategoria("A");
		prod.setCodigoBarras("123");
		prod.setNombre("Jarabe");
		prod.setPrecio(new BigDecimal(20));
		prod.setStock("Si");
		
		this.productoService.agregar(prod);
		this.productoService.buscarListaProductos("123", "1");
		this.facturaService.listareporteFactura(LocalDate.now(), "A", "1");
		
	}

}
