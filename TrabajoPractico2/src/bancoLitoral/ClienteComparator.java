package bancoLitoral;

import java.util.Comparator;

public class ClienteComparator implements Comparator<Credito> {

	@Override
	public int compare(Credito o1, Credito o2) {
		return o1.compareTo(o2);
	}
}
