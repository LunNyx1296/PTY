package principal;

import java.time.LocalDate;

public class Cita {

	private LocalDate fecha;
	private String dniPareja;
	private Boolean resultado;

	public Cita(LocalDate fecha, String dniPareja) {
		this.fecha = fecha;
		this.dniPareja = dniPareja;
		this.resultado = null;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getDniPareja() {
		return dniPareja;
	}

	public Boolean getResultado() {
		return resultado;
	}

	public void setResultado(Boolean resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		String res = (resultado == null ? "Sin evaluar" : (resultado ? "Éxito" : "Fracaso"));
		return fecha + " - con DNI " + dniPareja + " - " + res;
	}
}
