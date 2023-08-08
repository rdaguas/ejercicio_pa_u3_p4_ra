package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductoRepositoryImpl implements IProductoRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Producto producto) {
		this.entityManager.persist(producto);
		
	}

	@Override
	public void actualizar(Producto producto) {
		this.entityManager.merge(producto);
		
	}

	@Override
	public Producto seleccionar(String stock) {
		TypedQuery<Producto> myQuery = this.entityManager.createQuery("SELECT e FROM Producto e WHERE e.stock = :datoStock", Producto.class);
		myQuery.setParameter("datoStock", stock);
		return myQuery.getSingleResult();
	}

	@Override
	public void eliminar(String stock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Producto> listaProductos(String codigoBarras, String cantidad) {
		TypedQuery<Producto> myQuery =  this.entityManager.createQuery("SELECT e FROM Producto e WHERE e.codigoBarras:datoCodigoBarras AND e.cantidad:datoCantidad", Producto.class);
		myQuery.setParameter("datoCodigoBarras", codigoBarras);
		myQuery.setParameter("datoCantidad", cantidad);
		return myQuery.getResultList();
	}

}
