package principal;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pretendiente extends Persona {

	private String generoBuscado;
	private ArrayList<Cita> citas;

	public Pretendiente(String dni, String nombre, LocalDate fechaNacimiento, String genero, String localidad,
			String generoBuscado) {
		super(dni, nombre, fechaNacimiento, genero, localidad);
		this.generoBuscado = generoBuscado;
		this.citas = new ArrayList<>();
	}

	public String getGeneroBuscado() {
		return generoBuscado;
	}

	public ArrayList<Cita> getCitas() {
		return citas;
	}

	public void addCita(Cita c) {
		citas.add(c);
	}

	public Cita buscarCitaPorFecha(LocalDate fecha) {
		for (Cita c : citas)
			if (c.getFecha().equals(fecha))
				return c;
		return null;
	}

	@Override
	public String toString() {
		return "Pretendiente: " + super.toString() + " - Busca: " + generoBuscado;
	}
}
