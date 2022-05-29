package scoopsAhoy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class FacturasAdminAbstract {
	protected List<Factura> facturasList;

	public FacturasAdminAbstract() {
		this.facturasList = new ArrayList();
	}

	public void add(Factura factura) {
		this.facturasList.add(factura);
	}

	public void remove(int indice) {
		this.facturasList.remove(indice);
	}

	/** Ordena las facturas según el criterio de compareTo() en Factura */
	public void ordenar() {
		Collections.sort(this.facturasList);
	}

	/** Ordena las facturas por el criterio especificado como parámetro. */
	public void ordenar(Comparator c) {
		this.facturasList.sort(c);
	}

	/**
	 * Busca todas las facturas correspondientes al mes y año pasados por parámetro.
	 */
	public abstract List<Factura> buscarFacturasPorMesAnio(int mes, int anio);

	/** Busca todas las facturas de la empresa pasada por parámetro. */
	public abstract List<Factura> buscarFacturasPorProveedor(Empresa empresa);

	/** Determina la factura con mayor importe total */
	public abstract Factura facturaMasCostosa();

	/** Determina los 5 productos que mayor cantidad de veces se compraron */
	public abstract List<Producto> top5ProductoCantidad();

	public String toString() {
		String resultado = "";
		for (Factura f : facturasList) {
			resultado += f.toString();
		}
		return resultado;
	}
}
