package scoopsAhoy;

import java.util.Objects;

public class ProductoCantidad {
	private int cantidadProducto;
	private Producto producto;

	/**
	 * @param cantidadProducto
	 * @param producto
	 */
	public ProductoCantidad(int cantidadProducto, Producto producto) {
		super();
		this.cantidadProducto = cantidadProducto;
		this.producto = producto;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public Producto getProducto() {
		return producto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(producto.getCodigo());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoCantidad other = (ProductoCantidad) obj;
		return Objects.equals(producto.getCodigo(), other.producto.getCodigo());
	}

	@Override
	public String toString() {
		return "ProductoCantidad [cantidadProducto=" + cantidadProducto + ", producto=" + producto + "]";
	}

}
