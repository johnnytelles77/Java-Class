package com.coderhouse.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coderhouse.models.Categoria;
import com.coderhouse.models.Cliente;
import com.coderhouse.models.Producto;
import com.coderhouse.models.Venta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class DaoFactory {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void persistirCliente(Cliente cliente) {
        em.persist(cliente);
    }

    @Transactional
    public void persistirProducto(Producto producto) {
        em.persist(producto);
    }

    @Transactional
    public void persistirCategoria(Categoria categoria) {
        em.persist(categoria);
    }

    @Transactional
    public Venta crearVenta(Cliente cliente, List<Producto> productos) {
        Venta venta = new Venta(cliente);
        for (Producto p : productos) {
            venta.agregarProducto(p);
        }
        em.persist(venta);
        return venta;
    }
}
