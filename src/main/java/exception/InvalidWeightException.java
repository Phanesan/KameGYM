package main.java.exception;

public class InvalidWeightException extends Exception{
	
	public InvalidWeightException() {
		super("Peso invalido");
	}
	
	public InvalidWeightException(String msg) {
		super(msg);
	}
	
}
