package sistemaContable;

import java.math.BigDecimal;
import java.util.List;

public class ContableAdmin extends ContableAdminAbstract {
private CuentaContable cuenta;
private Asiento asiento;

	public ContableAdmin(CuentaContable cuenta, Asiento asiento) {
	this.cuenta = cuenta;
	this.asiento = asiento;
}
	/** Ordena los asientos por fecha y luego por número. */
	@Override
	public void ordenar() {
		asiento.getFecha(); 
		asiento.getNumero();
		
	}
	/** Devuelve todos los asientos en los que la cuenta aparece */
	@Override
	public List<Asiento> asientosPorCuenta(CuentaContable cuenta) {
		// TODO Auto-generated method stub
		return null;
	}
	/** Devuelve todos los asientos de un año/mes */
	@Override
	public List<Asiento> asientosPorAnioYMes(int anio, int mes) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Devuelve el saldo de la cuenta sumando el importe de los detalles de asientos
	 * donde la cuenta tiene tipo movimiento debe y restando si es igual a haber.
	 */
	@Override
	public BigDecimal saldoImputable(CuentaContable cuenta) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Devuelve el saldo de cuenta sumando / restando el importe de las cuentas
	 * hijas imputables.
	 */
	@Override
	public BigDecimal saldoNoImputable(List<CuentaContable> planCuentas, CuentaContable cuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
