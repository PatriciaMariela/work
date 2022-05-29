package scoopsAhoy;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class FacturasAdmin extends FacturasAdminAbstract {

	

	public FacturasAdmin() {
		super();
	}

	@Override
	public List<Factura> buscarFacturasPorMesAnio(int mes, int anio) {
		List<Factura> facturasPorMesAnio = new ArrayList<Factura>();

		for (Factura f : facturasList)
			if (f.getFecha().getMonth() == mes && f.getFecha().getYear() == anio) {
				facturasPorMesAnio.add(f);
			}

		return facturasPorMesAnio;
	}

	@Override
	public List<Factura> buscarFacturasPorProveedor(Empresa empresa) {
		List<Factura> facturasPorProveedor = new ArrayList<Factura>();

		for (Factura f : facturasList)
			if (f.getProveedor().getCuit().equals(empresa.getCuit())) {
				facturasPorProveedor.add(f);
			}
		return facturasPorProveedor;
	}

	@Override
	public Factura facturaMasCostosa() {
		Collections.max(facturasList, new FacturaMasCostosaComparator());
		Factura f = facturasList.get(0);
		return f;
	}

	/** Determina los 5 productos que mayor cantidad de veces se compraron */

	@Override
	public List<Producto> top5ProductoCantidad() {
		List<Producto> top5 = new ArrayList<Producto>();
		Collections.sort(facturasList, new ProductoCantidadComparator());
		for (int i = 0; i < top5.size(); i++)
			top5.add(facturasList.get(i).getDetalleFactura().get(i).getProducto());
		return top5;
	}
	
	@Override
	public String toString() {
		for (int i = 0; i < facturasList.size(); i++) {
			System.out.println((i + 1) + ".| " + facturasList.get(i).getTipoDeFactura() + " | " + facturasList.get(i).getPuntoDeVenta() + " | " + facturasList.get(i).getNum() + " | " +
					facturasList.get(i).getFecha() + " | \n" +facturasList.get(i).getProveedor()+ " | "+ facturasList.get(i).getDetalleFactura() + " \nImporte total: " + facturasList.get(i).getImporteTotal());
	}
		return "";
	}
}
