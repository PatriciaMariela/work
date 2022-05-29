package bancoLitoral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CreditosAdmin extends CreditosAdminAbstract {

	public CreditosAdmin() {
		super();
	}

	@Override
	public List<Credito> creditosPorClienteTipo(ClienteTipoEnum tipo) {
		List<Credito> credXCliTipo = new ArrayList<Credito>();

		for (Credito c : creditosList)
			if (c.getTipo().getClienteTipo().equals(tipo)) {
				credXCliTipo.add(c);
			}
		return credXCliTipo;
	}

	@Override
	public List<Credito> creditosPorCreditoTipoySucursal(CreditoTipo tipo, Sucursal sucursal) {
		List<Credito> credXCliTipoySucu = new ArrayList<Credito>();

		for (Credito c : creditosList)
			if (c.getTipo().equals(tipo) && c.getSucursal().equals(sucursal)) {
				credXCliTipoySucu.add(c);
			}
		return credXCliTipoySucu;
	}

	@Override
	public List<Credito> creditosInferioresA(double monto) {
		List<Credito> credInferiores = new ArrayList<Credito>();

		for (Credito c : creditosList)
			if (c.getMontoAcordado() < monto) {
				credInferiores.add(c);
			}
		return credInferiores;
	}

	@Override
	public List<Credito> creditosSuperioresA(double monto) {
		List<Credito> credSuperiores = new ArrayList<Credito>();

		for (Credito c : creditosList)
			if (c.getMontoAcordado() > monto) {
				credSuperiores.add(c);
			}
		return credSuperiores;
	}

	@Override
	public void ordenar() {
		Collections.sort(creditosList);
	}

	@Override
	public void ordenar(Comparator comparator) {
		Collections.sort(creditosList, comparator);
	}

	@Override
	public String toString() {
		System.out.println("Id" + ".| " + "Tipo Crédito" + " | " + "Cliente" + " |" + "Monto Acordado" + " | "
				+ "Plazo Fijo" + " | " + "Sucursal" + " | " + "Total a Devolver");

		for (int i = 0; i < creditosList.size(); i++) {
			System.out.println((i + 1) + ".| " + creditosList.get(i).getTipo() + " | "
					+ creditosList.get(i).getCliente() + " | " + creditosList.get(i).getMontoAcordado() + " | "
					+ creditosList.get(i).getPlazoFijoAnios() + " | " + creditosList.get(i).getSucursal() + " | "
					+ creditosList.get(i).getTotalADevolver());
		}
		return "";
	}

}
