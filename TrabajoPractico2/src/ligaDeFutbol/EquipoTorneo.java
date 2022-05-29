package ligaDeFutbol;

import java.util.Objects;

public class EquipoTorneo implements Comparable<EquipoTorneo> {
	protected Equipo equipo;
	protected Torneo torneo;
	protected int partidosJugados;
	protected int partidosGanados;
	protected int partidosEmpatados;
	protected int partidosPerdidos;
	protected int golesAFavor;
	protected int golesEnContra;
	protected int puntos;

	public EquipoTorneo(Equipo equipo, Torneo torneo, int partidosJugados, int partidosGanados, int partidosEmpatados,
			int partidosPerdidos, int golesAFavor, int golesEnContra) {
		this.equipo = equipo;
		this.torneo = torneo;
		this.partidosJugados = partidosJugados;
		this.partidosGanados = partidosGanados;
		this.partidosEmpatados = partidosEmpatados;
		this.partidosPerdidos = partidosPerdidos;
		this.golesAFavor = golesAFavor;
		this.golesEnContra = golesEnContra;
	}

	public Torneo getTorneo() {
		return torneo;
	}

	public int getPartidosJugados() {
		return partidosJugados;
	}

	public int getPartidosGanados() {
		return partidosGanados;
	}

	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}

	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}

	public int getGolesAFavor() {
		return golesAFavor;
	}

	public int getGolesEnContra() {
		return golesEnContra;
	}

	// devuelve la cantidad de puntos que le corresponden al equipo en el
	// torneo. Los partidos ganados valen 3 puntos, los empatados 1 y los perdidos
	// 0.
	public int getPuntos() {
		int puntosG = (this.partidosGanados * 3);
		int puntosE = (this.partidosEmpatados * 1);
		puntos = puntosG + puntosE;
		return puntos;
	}

	public int getDiferenciaGol() {
		return golesAFavor - golesEnContra;
	}

	@Override
	public String toString() {
		
		return equipo + " | " + partidosJugados + " | " + partidosGanados + " | " + partidosEmpatados + " | "
				+ partidosPerdidos + " | " + golesAFavor + " | " + golesEnContra + " | " + getDiferenciaGol() + " | "
				+ puntos + "\n";

	}

	@Override
	public int hashCode() {
		return Objects.hash(torneo);
	}

	@Override
	public int compareTo(EquipoTorneo o) {
		int rta = 0;
		if(this.equipo.getNombre().compareTo(o.equipo.getNombre()) < 0){
			rta = -1;
		}else {
			if(this.equipo.getNombre().compareTo(o.equipo.getNombre()) > 0) {
				rta = 1;
			}
		}
		return rta;
	}

}
