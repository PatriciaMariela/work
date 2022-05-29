package ligaDeFutbol;

import java.util.Objects;

public class Torneo {
	protected String nombre;
	protected int anio;

	public Torneo(String nombre, int anio) {
		this.nombre = nombre;
		this.anio = anio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return nombre + " edición " + anio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anio, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Torneo other = (Torneo) obj;
		return anio == other.anio && Objects.equals(nombre, other.nombre);
	}

}
