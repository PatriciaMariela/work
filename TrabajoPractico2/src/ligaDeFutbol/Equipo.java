package ligaDeFutbol;

import java.util.Objects;

public class Equipo implements Comparable<Equipo> {

	protected String nombre;
	protected Ciudad ciudad;

	public Equipo(String nombre, Ciudad ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(nombre, other.nombre);
	}

	
	@Override
	public int compareTo(Equipo o) {
		int rta = 0;
		if(this.getNombre().compareTo(o.getNombre()) < 0){
			rta = 1;
		}else {
			if(this.getNombre().compareTo(o.getNombre()) > 0) {
				rta = -1;
			}
		}
		return rta;
	}

}
