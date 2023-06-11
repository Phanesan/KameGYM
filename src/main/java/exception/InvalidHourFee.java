package main.java.exception;

public class InvalidHourFee extends Exception{
	public InvalidHourFee() {
		super("Tarifa: Formato de hora invalido ");
	}
	
	public InvalidHourFee(String msg) {
		super(msg);
	}
}
