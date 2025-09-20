package com.coderhouse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.models.Categoria;
import com.coderhouse.models.Cliente;
import com.coderhouse.models.Producto;
import com.coderhouse.models.Venta;

@SpringBootApplication
public class Clase09Application implements CommandLineRunner{
	@Autowired
	private DaoFactory dao;

	public static void main(String[] args) {
		SpringApplication.run(Clase09Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		try {
			
	        // Productos
	        Producto producto1 = new Producto("Mac", 1500.0, 10);
	        Producto producto2 = new Producto("Linux", 1000.0, 20);
	        Producto producto3 = new Producto("Microsoft", 2000.0, 5);
	        Producto producto4 = new Producto("Ipad", 150.00, 12);

	        // Clientes
	        Cliente cliente1 = new Cliente("Johnny", "Raiford st", "9196678665");
	        Cliente cliente2 = new Cliente("Juan", "Noble st", "9193339986");
	        Cliente cliente3 = new Cliente("Joana", "Hillary st", "91965763210");

	        dao.persistirCliente(cliente1);
	        dao.persistirCliente(cliente2);
	        dao.persistirCliente(cliente3);

	        // Categoría
	        Categoria laptops = new Categoria("Laptops");
	        Categoria Desktops = new Categoria("Desktops");
	        Categoria Tablets = new Categoria("Tablets");
	        dao.persistirCategoria(laptops);
	        dao.persistirCategoria(Desktops);
	        dao.persistirCategoria(Tablets);

	        // Asignar categoría a productos
	        producto1.setCategoria(laptops);
	        producto2.setCategoria(Desktops);
	        producto3.setCategoria(Desktops);
	        producto4.setCategoria(Tablets);

	        dao.persistirProducto(producto1);
	        dao.persistirProducto(producto2);
	        dao.persistirProducto(producto3);

	        // Venta ejemplo
	        // Ventas
            Venta venta1 = dao.crearVenta(cliente1, List.of(producto1, producto3));
            Venta venta2 = dao.crearVenta(cliente2, List.of(producto2));

            System.out.println("Ventas registradas:");
            System.out.println(venta1);
            System.out.println(venta2);


	       

	        System.out.println("Datos iniciales cargados correctamente.");

	        
	        dao.asignarCatgoriaAProducto(producto1.getIdProducto(), laptops.getId());

				
		}catch(Exception e) {
			   e.printStackTrace(System.err);
		}
			
		}

	}
