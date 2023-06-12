package main.java.exception;

public class DuplicateTarifaException extends Exception{
	
	public DuplicateTarifaException() {
		super("La tarifa ya existe");
	}
	
	public DuplicateTarifaException(String msg) {
		super(msg);
	}
	
}
