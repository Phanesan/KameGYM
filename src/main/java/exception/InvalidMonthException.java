package main.java.exception;

public class InvalidMonthException extends Exception{
	
	public InvalidMonthException() {
		super("Formato de mes invalido");
	}
	
	public InvalidMonthException(String msg) {
		super(msg);
	}

}
