package logica;

import java.util.Date;

public class Princiapl {

	public static void main(String[] args) {
		 
		Date d1 = new Date(22, 8, 26);
		Persona p1 = new Persona("48664658", "Diaz", "Cedres", "Mauro", "Daniel", d1, "123456", "mauro.diaz@correo.com", null);
		//System.out.println("Usuario: " );
		//System.out.println("Contrasena: " );
		
		System.out.println(p1);
	}

}
