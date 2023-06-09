package main.java;

public class UserCredential {
	
	public String correo;
	public String nombre;
	public String apellidos;
	public String password;
	public float peso;
	public float estatura;
	public String fechaDeNacimiento;
	
	public UserCredential(String correo,
							String nombre,
							String apellidos,
							String password,
							float peso,
							float estatura,
							String fechaDeNacimiento) {
		this.correo = correo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.password = password;
		this.peso = peso;
		this.estatura = estatura;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
}
