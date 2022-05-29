package bancoLitoral;

import java.util.Objects;

public class CreditoTipo {
	private String descripcion;
	private Double montoMinimo;
	private Double montoMaximo;
	private int aniosMinimos;
	private int aniosMax;
	private ClienteTipoEnum tipo;
	private Double tasaDeInteres;

	public CreditoTipo(String descripcion, Double montoMinimo, Double montoMaximo, int aniosMinimos, int aniosMax,
			ClienteTipoEnum clienteTipo, Double tasaDeInteres) {
		super();
		this.descripcion = descripcion;
		this.montoMinimo = montoMinimo;
		this.montoMaximo = montoMaximo;
		this.aniosMinimos = aniosMinimos;
		this.aniosMax = aniosMax;
		this.tipo = clienteTipo;
		this.tasaDeInteres = tasaDeInteres;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getMontoMinimo() {
		return montoMinimo;
	}

	public void setMontoMinimo(Double montoMinimo) {
		this.montoMinimo = montoMinimo;
	}

	public Double getMontoMaximo() {
		return montoMaximo;
	}

	public void setMontoMaximo(Double montoMaximo) {
		this.montoMaximo = montoMaximo;
	}

	public int getAniosMinimos() {
		return aniosMinimos;
	}

	public void setAniosMinimos(int aniosMinimos) {
		this.aniosMinimos = aniosMinimos;
	}

	public int getAniosMax() {
		return aniosMax;
	}

	public void setAniosMax(int aniosMax) {
		this.aniosMax = aniosMax;
	}

	public ClienteTipoEnum getClienteTipo() {
		return tipo;
	}

	public void setClienteTipo(ClienteTipoEnum clienteTipo) {
		this.tipo = clienteTipo;
	}

	public Double getTasaDeInteres() {
		return tasaDeInteres;
	}

	public void setTasaDeInteres(Double tasaDeInteres) {
		this.tasaDeInteres = tasaDeInteres;
	}

	@Override
	public int hashCode() {
		return Objects.hash(tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditoTipo other = (CreditoTipo) obj;
		return tipo == other.tipo;
	}

	@Override
	public String toString() {
		return descripcion;
	}

}
