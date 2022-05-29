package bancoLitoral;

import java.util.Comparator;

public class TotalDevolverComparator implements Comparator<Credito> {

	@Override
	public int compare(Credito o1, Credito o2) {

		return o1.getTotalADevolver().compareTo(o2.getTotalADevolver());
	}

}
