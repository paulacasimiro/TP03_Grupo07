package ar.edu.unju.edm.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Producto;
import ar.edu.unju.edm.repository.ProductoRepository;
import ar.edu.unju.edm.service.ProductoService;

@Service 
public class ImpProductoService implements ProductoService{
	
	@Autowired 
	Producto unProductoService; 
	@Autowired 
	ProductoRepository productoRepository; 

	@Override
	public void cargarProducto(Producto unProducto) {
		
		// TODO Auto-generated method stub
		unProducto.setEstado(true);
		productoRepository.save(unProducto); 
	}

	@Override
	public void eliminarProducto(Integer codigo) {
		// TODO Auto-generated method stub
		Optional<Producto> aux = Optional.of(new Producto()); 
		aux= productoRepository.findById(codigo);
		aux.get().setEstado(false );
		productoRepository.save(aux.get()); 
		
		
	}

	@Override
	public List<Producto> listarTodosProductos() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoRepository.findByEstado(true); 
	}

	@Override
	public Producto listarUnProducto(Integer codigo) {
		// TODO Auto-generated method stub
		Optional<Producto> aux = Optional.of(new Producto()); 
		aux= productoRepository.findById(codigo);
		return aux.get();
	}

	@Override
	public void modificarProducto(Producto productoModificar) {
		// TODO Auto-generated method stub
		
	}

}
