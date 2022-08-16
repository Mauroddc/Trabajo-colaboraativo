package logica;

public class Funcionalidad {
	private String nombre;
	private String descripcion;
	
	public Funcionalidad(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	//Método boolean funcionalidad
	public boolean acceso(Persona p) {
		boolean accesoFuncionalidad = false;
		
		//Aquí iría la lógica del acceso
		
		return accesoFuncionalidad;
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
		return "Funcionalidad [nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	
}
