package ligaDeFutbol;

import java.util.Comparator;

public class VallaMenosVencidaComparator implements Comparator<EquipoTorneo> {

	@Override
	public int compare(EquipoTorneo o1, EquipoTorneo o2) {
		return Integer.compare(o1.getGolesEnContra(), o2.getGolesEnContra());
	}

}
