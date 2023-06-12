package main.java;

import main.java.UserCredential.UserCredentialBuilder;

public class ClassCredential {
	public String instructor;
	public String nombre;
	public int duracionHoras;
	
	public ClassCredential(String instructor,
							String nombre,
							int duracionHoras){
		this.instructor = instructor;
		this.nombre = nombre;
		this.duracionHoras = duracionHoras;
	}
	
	public String getInstructor() {
		return instructor;
	}
	
	public String getNombre() {
		return nombre;
		
	}

	public int getDuracionHoras() {
		return duracionHoras;
	}
	
}
