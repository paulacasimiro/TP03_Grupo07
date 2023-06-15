package ar.edu.unju.edm.controller;
import java.util.Base64;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;



import ar.edu.unju.edm.model.Producto;
import ar.edu.unju.edm.service.ProductoService;


@Controller

public class ProductoController {
	private static final Log CASIMIRO= LogFactory.getLog(ProductoController.class);
	
	@Autowired 
	ProductoService productoService; 
	
	@Autowired 
	Producto unProducto; 

  @GetMapping("/cargarProducto")
    	public ModelAndView mostrarFormulario(@RequestParam("codigo") Optional<Integer> codigo) {
        	Optional<Producto> optProducto = codigo.map(productoService::recuperarProducto).orElse(Optional.of(new Producto()));
		Producto producto = optProducto.get(); // .orElse(null);
		ModelAndView nuevo = new ModelAndView("formulario");
		nuevo.addObject("producto", producto);

        	return nuevo;
	}

	@GetMapping("/eliminarProducto/{codigo}")
	public ModelAndView eliminarProducto (@PathVariable (name = "codigo") Integer codigo) {
		ModelAndView nuevo= new ModelAndView ("listado"); 
		try {
			productoService.eliminarProducto(codigo); 
		}catch (Exception e) {
			nuevo.addObject("eliminarProductoErrorMessage", e.getMessage()); 
		}
		
		try {
			nuevo.addObject("listado", productoService.listarTodosProductos()); 
		}catch (Exception e) {
			nuevo.addObject("eliminarProductoErrorMessage", e.getMessage()); 
			
		}
		return nuevo;
		
	}
	
	@PostMapping(value="/guardarProducto", consumes="multipart/form-data")
	public ModelAndView guardarProducto(@ModelAttribute("formulario") Producto productoConDatos, @RequestParam ("file") MultipartFile[] archivo) {
		ModelAndView nuevo= new ModelAndView ("listado"); 
		
		//Carga de la foto
		try {
			byte[] contenido = archivo[0].getBytes();
			String base64 = Base64.getEncoder().encodeToString(contenido);
			productoConDatos.setFoto(base64);
			
			productoService.cargarProducto(productoConDatos);
		}catch (Exception e) {
			nuevo.addObject("subirPeliculaErrorMensaje", e.getMessage());
			CASIMIRO.error(e);
		}
		
		nuevo.addObject("listado", productoService.listarTodosProductos()); 
		
		return nuevo;
	} 
	
	
}