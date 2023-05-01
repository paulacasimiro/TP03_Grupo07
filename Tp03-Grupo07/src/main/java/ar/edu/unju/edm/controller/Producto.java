package ar.edu.unju.edm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Producto;
import ar.edu.unju.edm.util.Productos;

@Controller

public class ProductoController {
	@GetMapping ("/")
	
	public ModelAndView mostrarPagPrincipal () {
		
		ModelAndView name= new ModelAndView ("pagPrincipal"); 
		return name;
		
	}

	@GetMapping("/cargarProducto")
	
	public ModelAndView solicitarProducto() {
		Producto unProducto= new Producto();
		ModelAndView name= new ModelAndView("cargarProducto");
		name.addObject("producto", unProducto);
		return name;
	}
	
	@PostMapping("/guardarProducto")
	public ModelAndView cargarProducto(@ModelAttribute("cargarProducto") Producto nuevoProducto, Productos listado) {
		nuevoProducto.setEstado(true);
		Productos.getListadoDeProductos().add(nuevoProducto);
		ModelAndView listadoFinal= new ModelAndView("mostrarProductos");
		listadoFinal.addObject("listado", Productos.getListadoDeProductos());
		return listadoFinal;
	}
	

}