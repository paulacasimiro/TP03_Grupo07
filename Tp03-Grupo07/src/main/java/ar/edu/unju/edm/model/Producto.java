package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Component
@Entity
public class Producto {
	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer codigo;
	private String nombre;
	private String descripcion; 
	private Integer precio;
	private Integer stock; 
	private String marca; 
	private Boolean estado;
	@Lob
	@Column(name="fotografia", columnDefinition="BLOB")
	private String foto;
	
	
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}



	//CONSTRUCTORES POR PARAMETROS 
	public Producto(Integer codigo, String nombre, String descripcion, Integer precio, Integer stock, String marca,
			boolean estado) {

		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.marca = marca;
		this.estado = estado;
		this.foto = foto;
	}
	
   //GETTERS AND SETTERS
	public Integer getCodigo() {
  return codigo;
  }
  
	//GETTERS AND SETTERS
	/*
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
*/
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
}
