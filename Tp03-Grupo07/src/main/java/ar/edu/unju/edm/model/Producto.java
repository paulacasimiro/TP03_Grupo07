package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class Producto {
	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int codigo;
	private String nombre;
	private String descripcion; 
	private int precio;
	private int stock; 
	private String marca; 
	private boolean estado;
	
	//CONSTRUCTORES POR PARAMETROS 
	public Producto(int codigo, String nombre, String descripcion, int precio, int stock, String marca,
			boolean estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.marca = marca;
		this.estado = estado;
	}
	
	//GETTERS AND SETTERS
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
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
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
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
	
	
	
}
