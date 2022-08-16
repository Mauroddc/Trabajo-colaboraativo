package logica;

import java.util.LinkedList;

public class Rol {

	LinkedList<Persona> listaPersona = new LinkedList <Persona>();
	private int id_Rol;
	private String nombre;
	private String descripcion;
		

	public Rol(LinkedList<Persona> listaPersona, int id_Rol, String nombre, String descripcion) {
		this.listaPersona = listaPersona;
		this.id_Rol = id_Rol;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getId_Rol() {
		return id_Rol;
	}

	public void setId_Rol(int id_Rol) {
		this.id_Rol = id_Rol;
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

	@Override
	public String toString() {
		return "Rol [id_Rol=" + id_Rol + ", nombre=" + nombre + ", descripcion=" + descripcion + ", listaPersona="
				+ listaPersona + "]";
	}
	
	
	
	
}
