package main.java.exception;

public class InvalidYearException extends Exception{
	
	public InvalidYearException() {
		super("Formato de año invalido");
	}
	
	public InvalidYearException(String msg) {
		super(msg);
	}

}
