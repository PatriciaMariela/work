package nota;

public class Nota {

	private int valorNota;

	/**
	 * pre: valorInicial esta comprendido entre 0 y 10. post: inicializa la Nota con
	 * el valor indicado.
	 */

	public Nota(int valorInicial) {
		this.setValorNota(valorInicial);
	}

	/**
	 * post: devuelve el valor numerico de la Nota, comprendido entre 0 y 10.
	 */
	public int getValor() {
		return this.valorNota;

	}

	/**
	 * post: indica si la Nota permite o no la aprobacion.
	 */
	public boolean aprobado() {
		return (this.valorNota >= 4);
	}

	/**
	 * post: indica si la Nota permite o no la aprobacion.
	 */
	public boolean desaprobado() {
		return (this.valorNota < 4);
	}

	/**
	 * pre: nuevoValor esta comprendido entre 0 y 10. post: modifica el valor
	 * numerico de la Nota, cambuandolo por nuevoValor, siempre y cuando nuevoValor
	 * sea superior al valor numerico actual de la Nota.
	 */
	public void recuperar(int nuevoValor) {
		if (nuevoValor > this.valorNota) {
			this.valorNota = nuevoValor;
		}
	}

	private boolean esValorCorrecto(int x) {
		return (x >= 0) && (x <= 10);
	}

	private void setValorNota(int nota) {
		if (!esValorCorrecto(nota)) {
			Error notaInvalida = new Error("Nota ingresada inválida");
			throw notaInvalida;
		}
		this.valorNota = nota;
	}

}
