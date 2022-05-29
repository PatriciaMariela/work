package sistemaContable;

import java.math.BigDecimal;
import java.util.Objects;

public class AsientoDetalle {
private CuentaContable cuenta;
private DebeHaber tipoDeMovimiento;
private BigDecimal importe;
public AsientoDetalle(CuentaContable cuenta, DebeHaber tipoDeMovimiento, BigDecimal importe) {
	super();
	this.cuenta = cuenta;
	this.tipoDeMovimiento = tipoDeMovimiento;
	this.importe = importe;
}
public CuentaContable getCuenta() {
	return cuenta;
}
public void setCuenta(CuentaContable cuenta) {
	this.cuenta = cuenta;
}
public DebeHaber getTipoDeMovimiento() {
	return tipoDeMovimiento;
}
public void setTipoDeMovimiento(DebeHaber tipoDeMovimiento) {
	this.tipoDeMovimiento = tipoDeMovimiento;
}
public BigDecimal getImporte() {
	return importe;
}
public void setImporte(BigDecimal importe) {
	this.importe = importe;
}
@Override
public int hashCode() {
	return Objects.hash(cuenta);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	AsientoDetalle other = (AsientoDetalle) obj;
	return Objects.equals(cuenta, other.cuenta);
}
@Override
public String toString() {
	return "AsientoDetalle [cuenta=" + cuenta + ", tipoDeMovimiento=" + tipoDeMovimiento + ", importe=" + importe + "]";
}


}
