package sistemaContable;

import java.util.Objects;

public class CuentaContable {
private String nomenclatura;
private String nombre;
private Boolean imputable;
private CuentaContable cuentaPadre;
public CuentaContable(String nomenclatura, String nombre, Boolean imputable, CuentaContable cuentaPadre) {
	this.nomenclatura = nomenclatura;
	this.nombre = nombre;
	this.imputable = imputable;
	this.cuentaPadre = cuentaPadre;
}

public String getNomenclatura() {
	return nomenclatura;
}

public void setNomenclatura(String nomenclatura) {
	this.nomenclatura = nomenclatura;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Boolean getImputable() {
	return imputable;
}

public void setImputable(Boolean imputable) {
	this.imputable = imputable;
}

public CuentaContable getCuentaPadre() {
	return cuentaPadre;
}

public void setCuentaPadre(CuentaContable cuentaPadre) {
	this.cuentaPadre = cuentaPadre;
}

@Override
public int hashCode() {
	return Objects.hash(cuentaPadre);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CuentaContable other = (CuentaContable) obj;
	return Objects.equals(cuentaPadre, other.cuentaPadre);
}
@Override
public String toString() {
	return "CuentaContable [nomenclatura=" + nomenclatura + ", nombre=" + nombre + ", imputable=" + imputable
			+ ", cuentaPadre=" + cuentaPadre + "]";
}


}
