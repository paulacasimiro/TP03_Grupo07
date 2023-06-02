package ar.edu.unju.edm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Producto;

@Service
public interface ProductoService {
	public void cargarProducto (Producto unProducto ); 
	public void eliminarProducto (Integer codigo); 
	public List <Producto>listarTodosProductos ();
	public Producto listarUnProducto(Integer codigo); 
	public void modificarProducto (Producto productoModificar); 

}
