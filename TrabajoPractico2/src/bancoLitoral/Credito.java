package bancoLitoral;

import java.util.Objects;

public class Credito implements Comparable<Credito> {

	private int numero;
	private CreditoTipo tipo;
	private Cliente cliente;
	private Double montoAcordado;
	private int plazoFijoAnios;
	private Sucursal sucursal;
	private Double totalADevolver;

	public Credito(int numero, Cliente cliente, CreditoTipo tipo, Double montoAcordado, int plazoFijoAnios,
			Sucursal sucursal) {

		this.cliente = cliente;
		setTipo(tipo);
		setMontoAcordado(montoAcordado);
		setPlazoFijoAnios(plazoFijoAnios);
		this.sucursal = sucursal;
		setTotalADevolver();

	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @return the tipo
	 */
	public CreditoTipo getTipo() {
		return tipo;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @return the montoAcordado
	 */
	public Double getMontoAcordado() {
		return montoAcordado;
	}

	/**
	 * @return the plazoFijoAnios
	 */
	public int getPlazoFijoAnios() {
		return plazoFijoAnios;
	}

	/**
	 * @return the sucursal
	 */
	public Sucursal getSucursal() {
		return sucursal;
	}

	/**
	 * @return the totalADevolver
	 */
	public Double getTotalADevolver() {
		return totalADevolver;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setTipo(CreditoTipo tipo) {
		if(this.cliente.getTipo().compareTo(tipo.getClienteTipo())==0) {
			this.tipo = tipo;
		}
		this.tipo = tipo;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setMontoAcordado(Double montoAcordado) {
		if (montoAcordado <= getTipo().getMontoMaximo() || montoAcordado >= getTipo().getMontoMinimo()) {
			this.montoAcordado = montoAcordado;
		} else {
			this.montoAcordado = 0.0;
		}
	}

	public void setPlazoFijoAnios(int plazoFijoAnios) {
		if (plazoFijoAnios >= getTipo().getAniosMinimos() && plazoFijoAnios <= getTipo().getAniosMax()) {
			this.plazoFijoAnios = plazoFijoAnios;
		} else {
			this.plazoFijoAnios = 0;
		}
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public void setTotalADevolver() {
		Double calculo = (tipo.getTasaDeInteres() * plazoFijoAnios);
		this.totalADevolver = (this.getMontoAcordado() * calculo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Credito other = (Credito) obj;
		return Objects.equals(cliente, other.cliente) && numero == other.numero;
	}

	@Override
	public String toString() {
		return "Id.|" + getNumero() + "| Tipo.|" + tipo + "| Cliente.|" + getCliente() + "| MontoAcordado.|"
				+ getMontoAcordado() + "| PlazoFijoAnios.|" + getPlazoFijoAnios() + "| Sucursal.|" + getSucursal()
				+ "| TotalADevolver.|" + totalADevolver;
	}

	@Override
	public int compareTo(Credito o) {
		return Integer.compare(this.numero, o.numero);
	}

}
