package main.java;

public class AssistModel {

	String correoUsuario;
	String fecha;
	String horaEntrada;
	String horaSalida;
	
	public AssistModel(String correoUsuario,
						String fecha,
						String horaEntrada,
						String horaSalida) {
		this.correoUsuario = correoUsuario;
		this.fecha = fecha;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public String getFecha() {
		return fecha;
	}

	public String getHoraEntrada() {
		return horaEntrada;
	}

	public String getHoraSalida() {
		return horaSalida;
	}
	
	
	
}
