package ligaDeFutbol;

import java.util.Comparator;

public class OrdenarPorOtrosCriterios implements Comparator<EquipoTorneo> {

	@Override
	public int compare(EquipoTorneo o1, EquipoTorneo o2) {
		int rta = 0;
		//
		if (Integer.compare(o1.getPuntos(), o2.getPuntos()) != 0) {
			rta = Integer.compare(o1.getPuntos(), o2.getPuntos());
		}
		//
		if (Integer.compare(o1.getPuntos(), o2.getPuntos()) == 0) {
			if (Integer.compare(o1.getDiferenciaGol(), o2.getDiferenciaGol()) < 0) {
				rta = -1;
			} else {
				if (Integer.compare(o1.getDiferenciaGol(), o2.getDiferenciaGol()) > 0) {
					rta = 1;
				}
			}
			
		}
		//
		if (Integer.compare(o1.getPuntos(), o2.getPuntos()) == 0) {
			if (Integer.compare(o1.getDiferenciaGol(), o2.getDiferenciaGol()) == 0) {
				if (Integer.compare(o1.getPartidosGanados(), o2.getPartidosGanados()) < 0) {
					rta = -1;
				} else {
					if (Integer.compare(o1.getPartidosGanados(), o2.getPartidosGanados()) > 0) {
						rta = 1;
					}
				}

			}
		}
		//
		if (Integer.compare(o1.getPuntos(), o2.getPuntos()) == 0) {
			if (Integer.compare(o1.getDiferenciaGol(), o2.getDiferenciaGol()) == 0) {
				if (Integer.compare(o1.getPartidosGanados(), o2.getPartidosGanados()) == 0) {
					rta = Integer.compare(o1.getPartidosEmpatados(), o1.getPartidosEmpatados());
				}

			}
		
		}
		return rta*-1;
	}
}
