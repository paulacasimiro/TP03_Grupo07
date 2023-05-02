package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Producto {
	private int codigo;
	private String nombre;
	private String descripcion;
	private int precioUnitario;
	private int stock;
	private boolean estado;
	
	public Producto(int codigo, String nombre, String descripcion, int precioUnitario, int stock, boolean estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.stock = stock;
		this.estado = estado;
	}
	
	public Producto() {
		
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

	public int getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(int precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	

}
