package ligaDeFutbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TorneosAdmin extends TorneoAdminAbstract  {

	public TorneosAdmin() {
		super();
	}

	/** Agrega una entrada a equipoTorneoList */

	@Override
	public void agregar(EquipoTorneo equipo) {
		equipoTorneoList.add(equipo);
	}

	/**
	 * Ordena las entradas en equipoTorneoList según los criterios por defecto
	 * 
	 * @param <T>
	 */

	@Override
	public void ordenar() {
		Collections.sort(equipoTorneoList);
	}

	/**
	 * Devuelve la tabla de posiciones para el torneo pasado como parámetro. De esta
	 * forma los equipos quedan en orden descendente de puntos, diferencia de gol, *
	 * partidos ganados y empatados
	 */

	@Override
	public List<EquipoTorneo> tablaPosiciones(Torneo torneo) {
		List<EquipoTorneo> tablaPosiciones = new ArrayList<EquipoTorneo>();

		for (EquipoTorneo eT : equipoTorneoList)
			if (eT.getTorneo() == torneo) {
				tablaPosiciones.add(eT);
			}
		Collections.sort(tablaPosiciones, new OrdenarPorOtrosCriterios());

		return tablaPosiciones;
	}

	@Override
	public List<Torneo> todosLosTorneos(Equipo equipo) {
		List<Torneo> todosLosTorneos = new ArrayList<Torneo>();
		for (int i = 0; i < equipoTorneoList.size(); i++) {
			if (equipoTorneoList.get(i).equipo == equipo) {
				Torneo t = equipoTorneoList.get(i).getTorneo();
				todosLosTorneos.add(t);
			}
		}
		return todosLosTorneos;
	}

	@Override
	public EquipoTorneo masGoleador() {
		Collections.sort(equipoTorneoList, new MasGoleadorComparator());
		EquipoTorneo masGoleador = equipoTorneoList.get(equipoTorneoList.size() - 1);
		return masGoleador;

	}

	@Override
	public EquipoTorneo vallaMenosVencida() {
		Collections.sort(equipoTorneoList, new VallaMenosVencidaComparator());
		EquipoTorneo vallaMenosVencida = equipoTorneoList.get(0);
		return vallaMenosVencida;
	}

	@Override
	public String toString() {
		System.out.println("Pos" + ".| " + "Equipo" + " | " + "PJ" + " | " + "PG" + " | " + "PE" + " | " + "PP" + " | "
				+ "GF" + " | " + "GC" + " | " + "DF" + " | " + "Puntos\n");

		for (int i = 0; i < equipoTorneoList.size(); i++) {
			System.out.println((i + 1) + ".| " + equipoTorneoList.get(i).equipo + " | "
					+ equipoTorneoList.get(i).partidosJugados + " | " + equipoTorneoList.get(i).partidosGanados + " | "
					+ equipoTorneoList.get(i).partidosEmpatados + " | " + equipoTorneoList.get(i).partidosPerdidos
					+ " | " + equipoTorneoList.get(i).golesAFavor + " | " + equipoTorneoList.get(i).golesEnContra
					+ " | " + equipoTorneoList.get(i).getDiferenciaGol() + " | " + equipoTorneoList.get(i).getPuntos());
		}
		return "";

	}

}
