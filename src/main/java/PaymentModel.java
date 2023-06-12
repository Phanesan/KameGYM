package main.java;

public class PaymentModel {
	
	public String idPago;
	public String tarifaNombre;
	public String usuario;
	public String fechaPago;
	public String monto;
	
	public PaymentModel(String idPago,
						String tarifaNombre,
						String usuario,
						String fechaPago,
						String monto) {
		this.idPago = idPago;
		this.tarifaNombre = tarifaNombre;
		this.usuario = usuario;
		this.fechaPago = fechaPago;
		this.monto = monto;
	}
	
}
