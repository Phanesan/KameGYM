package main.java.exception;

public class CredentialsException extends Exception{
	
	public CredentialsException() {
		super("Correo y/o contraseña incorrecta");
	}
	
	public CredentialsException(String msg) {
		super(msg);
	}
	
}
