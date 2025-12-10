package principal;

import java.time.LocalDate;

public abstract class Persona {

	protected String dni;
	protected String nombre;
	protected LocalDate fechaNacimiento;
	protected String genero;
	protected String localidad;

	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String genero, String localidad) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.localidad = localidad;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public String getLocalidad() {
		return localidad;
	}

	public int getEdad() {
		return LocalDate.now().getYear() - fechaNacimiento.getYear();
	}

	@Override
	public String toString() {
		return nombre + " (" + dni + ") - " + genero + " - " + localidad + " - Nacido: " + fechaNacimiento;
	}
}
