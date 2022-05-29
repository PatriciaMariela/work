package scoopsAhoy;

import java.util.Comparator;

public class ProductoCantidadComparator implements Comparator<Factura> {

	@Override
	public int compare(Factura o1, Factura o2) {
		return Integer.compare(o1.getDetalleFactura().get(0).getCantidad(), o2.getDetalleFactura().get(0).getCantidad())
				* -1;
	}

}
