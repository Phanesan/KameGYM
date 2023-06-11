package main.java.exception;

public class InvalidPriceFee extends Exception{
	public InvalidPriceFee() {
		super("Tarifa: Formato de precio invalido ");
	}
	
	public InvalidPriceFee(String msg) {
		super(msg);
	}
}
