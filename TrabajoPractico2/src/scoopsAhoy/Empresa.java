package scoopsAhoy;

import java.util.Objects;

public class Empresa implements Comparable<Empresa> {
	private String cuit;
	private String razonSocial;
	private SituacionIVAEnum situacionIva;

	public Empresa(String cuit, String razonSocial, SituacionIVAEnum situacionIva) {
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.situacionIva = situacionIva;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public SituacionIVAEnum getSituacionIva() {
		return situacionIva;
	}

	public void setSituacionIva(SituacionIVAEnum situacionIva) {
		this.situacionIva = situacionIva;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cuit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return Objects.equals(cuit, other.cuit);
	}

	@Override
	public String toString() {
		return "Razón social: " + razonSocial + " | Situación iva: " + situacionIva ;
	}

	@Override
	public int compareTo(Empresa o) {
		return this.getRazonSocial().compareTo(o.getRazonSocial());
	}

}
