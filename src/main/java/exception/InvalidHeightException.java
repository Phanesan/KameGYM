package main.java.exception;

public class InvalidHeightException extends Exception{
	
	public InvalidHeightException() {
		super("Estatura invalida");
	}
	
	public InvalidHeightException(String msg) {
		super(msg);
	}

}
