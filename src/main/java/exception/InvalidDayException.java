package main.java.exception;

public class InvalidDayException extends Exception{
	
	public InvalidDayException() {
		super("Formato de dia invalido");
	}
	
	public InvalidDayException(String msg) {
		super(msg);
	}

}
