package anioBis;

public class CalculoAnioBis {
	private int anio;

	public CalculoAnioBis(int anio) {
		this.anio = anio;
		esDivisibleEntreCuatroYNoPorCien();
		esDivisibleEntreCienYCuatrocientos();
	}

	private boolean esDivisibleEntreCuatroYNoPorCien() {
		return ((anio % 4 == 0) && (anio % 100 != 0));
	}

	private boolean esDivisibleEntreCienYCuatrocientos() {
		return ((anio % 100 == 0) && (anio % 400 == 0));
	}

	@Override
	public String toString() {
		if (esDivisibleEntreCuatroYNoPorCien() || esDivisibleEntreCienYCuatrocientos()) {
			return "El año " + anio + " es bisiesto, por lo tanto se admiten dos siestas";
		}
		return "El año " + anio + " no es bisiesto, levantese que no hay siestas";
	}
}
