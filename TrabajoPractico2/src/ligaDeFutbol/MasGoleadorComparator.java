package ligaDeFutbol;

import java.util.Comparator;

public class MasGoleadorComparator implements Comparator<EquipoTorneo> {

	@Override
	public int compare(EquipoTorneo o1, EquipoTorneo o2) {
		return Integer.compare(o1.getGolesAFavor(), o2.getGolesAFavor());
	}

}
