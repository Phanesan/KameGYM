package main.java.exception;

public class PasswordException extends Exception{
	
	public PasswordException() {
		super("La contraseña no es igual");
	}
	
	public PasswordException(String msg) {
		super(msg);
	}

}
