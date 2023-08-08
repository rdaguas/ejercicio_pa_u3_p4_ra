package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Factura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class FacturaRepositoryImpl implements IFacturaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Factura> reporteFactura() {
		TypedQuery<Factura> myQuery =  this.entityManager.createQuery("SELECT e FROM Factura e WHERE e.fecha:datoFecha", Factura.class);
		
		return myQuery.getResultList();
	}


}
