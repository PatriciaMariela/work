package scoopsAhoy;

import java.util.Comparator;

public class FacturaMasCostosaComparator implements Comparator<Factura> {

	@Override
	public int compare(Factura o1, Factura o2) {
		int rta = 0;
		if (o1.getImporteTotal() != o2.getImporteTotal()) {
			if (o1.getImporteTotal() < o2.getImporteTotal()) {
				rta = 1;
			} else {
				rta = -1;
			}
		}
		return rta;
	}

}
