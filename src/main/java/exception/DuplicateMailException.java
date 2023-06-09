package main.java.exception;

public class DuplicateMailException extends Exception{
	
	public DuplicateMailException() {
		super("El correo ya existe");
	}
	
	public DuplicateMailException(String msg) {
		super(msg);
	}
	
}
