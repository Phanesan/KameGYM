package main.java.exception;

public class InvalidNameFee extends Exception{
	public InvalidNameFee() {
		super("Tarifa: Formato de nombre invalido ");
	}
	
	public InvalidNameFee(String msg) {
		super(msg);
	}
}
