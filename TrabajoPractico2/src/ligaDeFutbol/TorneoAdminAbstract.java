package ligaDeFutbol;

import java.util.ArrayList;
import java.util.List;

public abstract class TorneoAdminAbstract {

	protected final List<EquipoTorneo> equipoTorneoList;

	public TorneoAdminAbstract() {
		this.equipoTorneoList = new ArrayList();
	}

	/** Agrega una entrada a equipoTorneoList */
	public abstract void agregar(EquipoTorneo equipoTorneo);

	/** Ordena las entradas en equipoTorneoList según los criterios por defecto */
	public abstract void ordenar();

	/**
	 * Devuelve la tabla de posiciones para el torneo pasado como parámetro. De esta
	 * forma los equipos quedan en orden descendente de puntos, diferencia de gol, *
	 * partidos ganados y empatados
	 */
	public abstract List<EquipoTorneo> tablaPosiciones(Torneo torneo);

	/** Devuelve los torneos de los que participó un equipo */
	public abstract List<Torneo> todosLosTorneos(Equipo equipo);

	/** Devuelve el equipo que más goles metió en el historial de torneos */
	public abstract EquipoTorneo masGoleador();

	/** Devuelve el equipo que menos goles recibió en el historial de torneos */
	public abstract EquipoTorneo vallaMenosVencida();

	/** Concatena en un String los datos de todos los torneos */
	public abstract String toString();
}
