package sistemaContable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class ContableAdminAbstract {
	protected List<Asiento> asientosList;

	public ContableAdminAbstract() {
		this.asientosList = new ArrayList();
	}

	public void add(Asiento asiento) {
		this.asientosList.add(asiento);
	}

	public void remove(int indice) {
		this.asientosList.remove(indice);
	}

	/** Ordena los asientos por fecha y luego por número. */
	public abstract void ordenar();

	/** Devuelve todos los asientos en los que la cuenta aparece */
	public abstract List<Asiento> asientosPorCuenta(CuentaContable cuenta);

	/** Devuelve todos los asientos de un año/mes */
	public abstract List<Asiento> asientosPorAnioYMes(int anio, int mes);

	/**
	 * Devuelve el saldo de la cuenta sumando el importe de los detalles de asientos
	 * donde la cuenta tiene tipo movimiento debe y restando si es igual a haber.
	 */
	public abstract BigDecimal saldoImputable(CuentaContable cuenta);

	/**
	 * Devuelve el saldo de cuenta sumando / restando el importe de las cuentas
	 * hijas imputables.
	 */
	public abstract BigDecimal saldoNoImputable(List<CuentaContable> planCuentas, CuentaContable cuenta);

	public abstract String toString();
}