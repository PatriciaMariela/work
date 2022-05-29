package scoopsAhoy;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ClienteScoopsAhoy {

	public static void main(String[] args) {

		TipoFacturaEnum facturaA = TipoFacturaEnum.FACTURA_A;
		TipoFacturaEnum facturaB = TipoFacturaEnum.FACTURA_B;
		TipoFacturaEnum facturaC = TipoFacturaEnum.FACTURA_C;

		Empresa e = new Empresa("333", "Mirasol", SituacionIVAEnum.RESP_INSCRIPTO);

		Producto p = new Producto(111, "a");
		Producto p1 = new Producto(222, "b");
		Producto p2 = new Producto(333, "c");
		Producto p3 = new Producto(444, "d");

		FacturaDetalle fd = new FacturaDetalle(6, p, 2, 25);
		FacturaDetalle fd2 = new FacturaDetalle(2, p2, 32, 42f);
		FacturaDetalle fd3 = new FacturaDetalle(2, p1, 22, 78f);

		List<FacturaDetalle> detalleFactura = new ArrayList();
		detalleFactura.add(fd);
		detalleFactura.add(fd2);
		detalleFactura.add(fd3);
		
		FacturaDetalle fd4 = new FacturaDetalle(6, p, 2, 25);
		FacturaDetalle fd5 = new FacturaDetalle(3, p2, 32, 42f);
		FacturaDetalle fd6 = new FacturaDetalle(1, p1, 22, 78f);
		
		List<FacturaDetalle> detalleFactura1 = new ArrayList();
		detalleFactura.add(fd4);
		detalleFactura.add(fd5);
		detalleFactura.add(fd6);
		
		FacturaDetalle fd7 = new FacturaDetalle(3, p, 2, 25);
		FacturaDetalle fd8 = new FacturaDetalle(0, p2, 32, 42f);
		FacturaDetalle fd9 = new FacturaDetalle(2, p1, 22, 78f);
		
		List<FacturaDetalle> detalleFactura2 = new ArrayList();
		detalleFactura.add(fd7);
		detalleFactura.add(fd8);
		detalleFactura.add(fd9);

		Factura f = new Factura(facturaA, 001, 1, new Date(0000000000), e, detalleFactura);
		Factura f1 = new Factura(facturaB, 002, 2, new Date(0012222), e, detalleFactura1);
		Factura f2 = new Factura(facturaC, 003, 3, new Date(000444400), e, detalleFactura2);

		FacturasAdmin fa = new FacturasAdmin();
		
		fa.add(f);
		fa.add(f1);
		fa.add(f2);
		
		
		System.out.println(fa.toString());

	}

}
