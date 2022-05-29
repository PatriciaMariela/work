package sistemaContable;

import java.util.List;
import java.util.Objects;

public class Asiento {
private Fecha fecha;
private Integer numero;
private String leyenda;
private List<AsientoDetalle> detalle;
public Asiento(Fecha fecha, Integer numero, String leyenda, List<AsientoDetalle> detalle) {
	super();
	this.fecha = fecha;
	this.numero = numero;
	this.leyenda = leyenda;
	this.detalle = detalle;
}

public Fecha getFecha() {
	return fecha;
}

public void setFecha(Fecha fecha) {
	this.fecha = fecha;
}

public Integer getNumero() {
	return numero;
}

public void setNumero(Integer numero) {
	this.numero = numero;
}

public String getLeyenda() {
	return leyenda;
}

public void setLeyenda(String leyenda) {
	this.leyenda = leyenda;
}

public List<AsientoDetalle> getDetalle() {
	return detalle;
}

public void setDetalle(List<AsientoDetalle> detalle) {
	this.detalle = detalle;
}

@Override
public int hashCode() {
	return Objects.hash(numero);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Asiento other = (Asiento) obj;
	return Objects.equals(numero, other.numero);
}
@Override
public String toString() {
	return "Asiento [fecha=" + fecha + ", numero=" + numero + ", leyenda=" + leyenda + ", detalle=" + detalle + "]";
}

}
