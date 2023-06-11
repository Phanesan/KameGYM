package main.java.exception;

public class InvalidTimeClass extends Exception{
	public InvalidTimeClass() {
		super("Clase: Formato de tiempo invalido ");
	}
	
	public InvalidTimeClass(String msg) {
		super(msg);
	}
}
