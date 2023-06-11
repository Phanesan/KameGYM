package main.java.exception;

public class InvalidNameClass extends Exception{
	public InvalidNameClass() {
		super("Clase: Formato de nombre invalido ");
	}
	
	public InvalidNameClass(String msg) {
		super(msg);
	}
}
