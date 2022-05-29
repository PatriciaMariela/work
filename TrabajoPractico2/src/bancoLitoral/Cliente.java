package bancoLitoral;

import java.util.Objects;

public class Cliente implements Comparable<Cliente> {

	private String apellido;
	private String nombre;
	private String dni;
	private ClienteTipoEnum tipo;

	public Cliente(String apellido, String nombre, String dni, ClienteTipoEnum tipo) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.tipo = tipo;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public ClienteTipoEnum getTipo() {
		return tipo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return apellido + " " + nombre;
	}

	@Override
	public int compareTo(Cliente o) {
		return this.apellido.compareTo(o.getApellido());
	}

}
