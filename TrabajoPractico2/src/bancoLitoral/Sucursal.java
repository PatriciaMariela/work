package bancoLitoral;

import java.util.Objects;

public class Sucursal {

	private String nombre;
	private int numeroID;

	public Sucursal(String nombre, int numeroID) {

		this.nombre = nombre;
		this.numeroID = numeroID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sucursal other = (Sucursal) obj;
		return numeroID == other.numeroID;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
