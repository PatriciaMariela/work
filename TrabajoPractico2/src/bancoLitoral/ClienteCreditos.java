package bancoLitoral;

public class ClienteCreditos {

	public static void main(String[] args) {
		Sucursal s = new Sucursal("Paquetita", 1);

		CreditoTipo cT = new CreditoTipo("Personal", 100000.0, 1000.0, 5, 0, ClienteTipoEnum.PERSONAL, 36.5);
		CreditoTipo cT2 = new CreditoTipo("Comercial", 1000000.0, 100000.0, 5, 1, ClienteTipoEnum.COMERCIAL, 32.5);
		CreditoTipo cT3 = new CreditoTipo("Construccion", 12000000.0, 1000000.0, 5, 1, ClienteTipoEnum.CONSTRUCCION,
				34.5);

		Cliente cli = new Cliente("Bernasconi", "Patricia", "000000", ClienteTipoEnum.PERSONAL);
		Cliente cli2 = new Cliente("Gomez", "Victoria", "003300", ClienteTipoEnum.COMERCIAL);
		Cliente cli3 = new Cliente("Basso", "Mariano", "044440", ClienteTipoEnum.COMERCIAL);
		Cliente cli4 = new Cliente("Luna", "Ignacio", "005555", ClienteTipoEnum.CONSTRUCCION);
		Cliente cli5 = new Cliente("Hernandez", "Ruben", "333000", ClienteTipoEnum.PERSONAL);

		CreditosAdmin solicitud = new CreditosAdmin();
		CreditosAdmin solicitud1 = new CreditosAdmin();
		CreditosAdmin solicitud2 = new CreditosAdmin();
		CreditosAdmin solicitud3 = new CreditosAdmin();

		solicitud.add(new Credito(1, cli, cT, 10000.0, 6, s));
		solicitud1.add(new Credito(2, cli2, cT2, 250000.0, 3, s));
		solicitud2.add(new Credito(3, cli3, cT3, 375000.0, 3, s));
		solicitud3.add(new Credito(4, cli4, cT, 410000.0, 3, s));
		solicitud.add(new Credito(5, cli5, cT, 350000.0, 1, s));

		System.out.println(solicitud.creditosSuperioresA(375000.0));
		System.out.println(solicitud.creditosInferioresA(379000.0));
		System.out.println(solicitud.creditosPorCreditoTipoySucursal(cT3, s));
		System.out.println(solicitud.creditosPorClienteTipo(ClienteTipoEnum.PERSONAL));
		System.out.println("");
		System.out.println(solicitud.toString());
//			nuevaSolicitud.ordenar();
//			System.out.println(nuevaSolicitud.toString());

//			nuevaSolicitud.ordenar(new TotalDevolverComparator());
//			System.out.println(nuevaSolicitud.toString());

	}

}
