package principal;

import java.time.LocalDate;

public class Empleado extends Persona {

	private String cargo;
	private LocalDate fechaAlta;

	public Empleado(String dni, String nombre, LocalDate fechaNacimiento, String genero, String localidad,
			String cargo) {
		super(dni, nombre, fechaNacimiento, genero, localidad);
		this.cargo = cargo;
		this.fechaAlta = LocalDate.now();
	}

	public String getCargo() {
		return cargo;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	@Override
	public String toString() {
		return "Empleado: " + super.toString() + " - Cargo: " + cargo + " - Fecha Alta: " + fechaAlta;
	}
}
