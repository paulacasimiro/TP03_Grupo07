package ar.edu.unju.edm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.model.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer>  {
	public List <Producto> findByEstado (Boolean estado); 

}
