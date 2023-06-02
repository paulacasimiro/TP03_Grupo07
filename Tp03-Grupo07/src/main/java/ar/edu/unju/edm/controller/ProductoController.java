package ar.edu.unju.edm.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import ar.edu.unju.edm.model.Producto;
import ar.edu.unju.edm.service.ProductoService;
import ar.edu.unju.edm.util.Productos;

@Controller

public class ProductoController {
	@Autowired 
	ProductoService productoService; 
	
	@Autowired 
	Producto unProducto; 
	@GetMapping ("/")
	
	public ModelAndView mostrarPagPrincipal () {
		
		ModelAndView name= new ModelAndView ("PagPrincipal"); 
		return name;
		
	}

	@GetMapping("/cargarProducto")
	
	public ModelAndView cargarProductos() {
		ModelAndView nuevo= new ModelAndView ("formulario"); 
		nuevo.addObject("producto", unProducto); 
		return nuevo;
	}
	
	@PostMapping("/guardarProducto")
	public ModelAndView guardarProducto(@ModelAttribute("formulario") Producto productoConDatos) {
		ModelAndView nuevo= new ModelAndView ("listado"); 
		productoService.cargarProducto(productoConDatos);
		nuevo.addObject("listado", productoService.listarTodosProductos()); 
		
		return nuevo;
	}
	
	
}