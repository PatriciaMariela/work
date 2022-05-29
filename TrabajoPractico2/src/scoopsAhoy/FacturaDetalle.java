package scoopsAhoy;

import java.util.Objects;

public class FacturaDetalle {
	private int numeroItem;
	private Producto producto;
	private Integer cantidad;
	private float precioUni;
	private float subTotal;

	public FacturaDetalle(int numeroItem, Producto producto, Integer cantidad, float precioUni) {
		this.numeroItem = numeroItem;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioUni = precioUni;
		setSubTotal();
	}

	public int getNumeroItem() {
		return numeroItem;
	}

	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecioUni() {
		return precioUni;
	}

	public void setPrecioUni(float precioUni) {
		this.precioUni = precioUni;
	}

	public float getSubTotal() {
		return subTotal;
	}

	public void setSubTotal() {
		this.subTotal = (cantidad*precioUni);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidad, numeroItem, precioUni, producto, subTotal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FacturaDetalle other = (FacturaDetalle) obj;
		return Objects.equals(cantidad, other.cantidad) && numeroItem == other.numeroItem
				&& Float.floatToIntBits(precioUni) == Float.floatToIntBits(other.precioUni)
				&& Objects.equals(producto, other.producto)
				&& Float.floatToIntBits(subTotal) == Float.floatToIntBits(other.subTotal);
	}

	@Override
	public String toString() {	
		
		return "\nProducto: " + producto + "\nCantidad:" + cantidad
				+ " Precio unitario: " + precioUni + "\nSubTotal: $" + subTotal+"\n";
	}

}
