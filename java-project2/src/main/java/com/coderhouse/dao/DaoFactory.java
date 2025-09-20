package com.coderhouse.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coderhouse.models.Categoria;
import com.coderhouse.models.Cliente;
import com.coderhouse.models.Producto;
import com.coderhouse.models.Venta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
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
	public void persistirVenta(Venta venta) {
	    em.persist(venta);
	}
	
	@Transactional
	public void persistirCategoria(Categoria categoria) {
	    em.persist(categoria);
	}
	
	@Transactional
	public Producto getProductoById(Long productoId) throws Exception {
		try {
			TypedQuery<Producto> query = em.createQuery("SELECT p FROM Producto p WHERE p.id = :id", Producto.class);
			return query.setParameter("id", productoId).getSingleResult();
		}catch(Exception e) {
			throw new Exception("El Producto No Existe");
		}
	}
	
	@Transactional
	public Categoria getCategoriaById(Long categoriaId) throws Exception {
		try {
			TypedQuery<Categoria> query = em.createQuery("SELECT c FROM Categoria c WHERE c.id = :id", Categoria.class);
			return query.setParameter("id", categoriaId).getSingleResult();
		}catch(Exception e) {
			throw new Exception("La Categoria No Existe");
		}
	}
	
	@Transactional
	public Cliente getClienteById(Long clienteId) throws Exception {
		try {
			TypedQuery<Cliente> query = em.createQuery("SELECT cl FROM Cliente cl WHERE cl.id = :id", Cliente.class);
			return query.setParameter("id", clienteId).getSingleResult();
		}catch(Exception e) {
			throw new Exception("El Cliente No Existe");
		}
	}
	
	@Transactional
	public void asignarCatgoriaAProducto(long productoId, Long categoriaId) throws Exception {
		// Obtener el producto por ID
		Producto producto = getProductoById(productoId);
		if(producto == null) {
			throw new Exception("El producto con id: " + productoId + " no existe");
		}
		// Obtener el categoria por ID
		Categoria categoria = getCategoriaById(categoriaId);
		if(categoria == null) {
			throw new Exception("La Categoria con id: " + categoriaId + " no existe");
		}
		
		producto.setCategoria(categoria);
		
		/// Persistir en la base de datos
		    em.merge(producto);
	}
	
	
	// Crear venta con productos
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
