package scoopsAhoy;

import java.util.Comparator;

public class ProveedorPorRSocialComparator implements Comparator<Factura> {

	@Override
	public int compare(Factura o1, Factura o2) {
		int rta = 0;
		if (o1.getProveedor().getRazonSocial().compareTo(o2.getProveedor().getRazonSocial()) != 0) {
			if (o1.getProveedor().getRazonSocial().compareTo(o2.getProveedor().getRazonSocial()) < 0) {
				rta = 1;
			} else {
				rta = -1;
			}
		}
		return rta;
	}
}
