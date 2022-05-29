package scoopsAhoy;

import java.util.Comparator;

public class FechaDeFacturaComparator implements Comparator<Factura> {

	@Override
	public int compare(Factura o1, Factura o2) {
		int rta = 0;
		if (o1.getFecha().compareTo(o2.getFecha()) != 0) {
			if (o1.getFecha().compareTo(o2.getFecha()) < 0) {
				rta = 1;
			} else {
				rta = -1;
			}
		}
		return rta;
	}
}
