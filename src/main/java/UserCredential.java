package main.java;

public class UserCredential {
	
	public String correo;
	public String nombre;
	public String apellidos;
	public String password;
	public float peso;
	public float estatura;
	public String fechaDeNacimiento;
	public byte[] icono;
	
	public UserCredential(String correo,
							String nombre,
							String apellidos,
							String password,
							float peso,
							float estatura,
							String fechaDeNacimiento,
							byte[] icono) {
		this.correo = correo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.password = password;
		this.peso = peso;
		this.estatura = estatura;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.icono = icono;
	}
	
	public UserCredential(UserCredentialBuilder builder) {
		this.correo = builder.correo;
		this.nombre = builder.nombre;
		this.apellidos = builder.apellidos;
		this.password = builder.password;
		this.peso = builder.peso;
		this.estatura = builder.estatura;
		this.fechaDeNacimiento = builder.fechaDeNacimiento;
		this.icono = builder.icono;
	}
	
	public static class UserCredentialBuilder {
		private String correo;
		private String nombre;
		private String apellidos;
		private String password;
		private float peso;
		private float estatura;
		private String fechaDeNacimiento;
		private byte[] icono;
		
		public UserCredentialBuilder(String correo) {
			this.correo = correo;
		}
		
		public UserCredentialBuilder setNombre(String nombre) {
			this.nombre = nombre;
			return this;
		}
		
		public UserCredentialBuilder setApellidos(String apellidos) {
			this.apellidos = apellidos;
			return this;
		}
		
		public UserCredentialBuilder setPassword(String password) {
			this.password = password;
			return this;
		}
		
		public UserCredentialBuilder setPeso(float peso) {
			this.peso = peso;
			return this;
		}
		
		public UserCredentialBuilder setEstatura(float estatura) {
			this.estatura = estatura;
			return this;
		}
		
		public UserCredentialBuilder setFechaDeNacimiento(String fechaDeNacimiento) {
			this.fechaDeNacimiento = fechaDeNacimiento;
			return this;
		}
		
		public UserCredentialBuilder setIcono(byte[] icono) {
			this.icono = icono;
			return this;
		}
		
		public UserCredential build() {
			return new UserCredential(this);
		}
	}
	
}
