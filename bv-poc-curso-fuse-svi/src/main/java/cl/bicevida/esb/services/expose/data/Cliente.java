package cl.bicevida.esb.services.expose.data;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	
	private List<Producto> productos;	
	

	public Cliente(){
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}	
	
	public List<Producto> getProductos() {
		
		if(productos == null){
			productos = new ArrayList<Producto>();
		}
		
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
	
}
