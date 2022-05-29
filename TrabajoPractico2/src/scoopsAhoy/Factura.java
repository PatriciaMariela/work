package scoopsAhoy;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Factura implements Comparable<Factura> {

	private TipoFacturaEnum tipoDeFactura;
	private Integer puntoDeVenta;
	private Integer num;
	private Date fecha;
	private Empresa proveedor;
	private List<FacturaDetalle> detalleFactura;
	private float importeTotal;

	public Factura(TipoFacturaEnum tipoDeFactura, Integer puntoDeVenta, Integer num, Date fecha, Empresa proveedor,
			List<FacturaDetalle> detalleFactura) {

		this.tipoDeFactura = tipoDeFactura;
		this.puntoDeVenta = puntoDeVenta;
		this.num = num;
		this.fecha = fecha;
		this.proveedor = proveedor;
		this.detalleFactura = detalleFactura;
		setImporteTotal(detalleFactura);
	}

	public TipoFacturaEnum getTipoDeFactura() {
		return tipoDeFactura;
	}

	public void setTipoDeFactura(TipoFacturaEnum tipoDeFactura) {
		this.tipoDeFactura = tipoDeFactura;
	}

	/**
	 * @return Devuelve el punto de venta
	 */
	public Integer getPuntoDeVenta() {
		return puntoDeVenta;
	}

	/**
	 * @param puntoDeVenta the puntoDeVenta to set
	 */
	public void setPuntoDeVenta(Integer puntoDeVenta) {
		this.puntoDeVenta = puntoDeVenta;
	}

	/**
	 * @return the num
	 */
	public Integer getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(Integer num) {
		this.num = num;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the proveedor
	 */
	public Empresa getProveedor() {
		return proveedor;
	}

	/**
	 * @param proveedor the proveedor to set
	 */
	public void setProveedor(Empresa proveedor) {
		this.proveedor = proveedor;
	}

	/**
	 * @return the detalleFactura
	 */
	public List<FacturaDetalle> getDetalleFactura() {
		return detalleFactura;
	}

	/**
	 * @param detalleFactura the detalleFactura to set
	 */
	public void setDetalleFactura(List<FacturaDetalle> detalleFactura) {
		this.detalleFactura = detalleFactura;
	}

	/**
	 * @return the importeTotal
	 */
	public float getImporteTotal() {
		return importeTotal;
	}

	/**
	 * @param importeTotal the importeTotal to set
	 */
	public void setImporteTotal(List<FacturaDetalle> fd) {
		for(int i=0;i<fd.size();i++)
		this.importeTotal = (fd.get(i).getNumeroItem() * fd.get(i).getSubTotal());
	}

	@Override
	public int hashCode() {
		return Objects.hash(num, tipoDeFactura);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		return Objects.equals(num, other.num) && tipoDeFactura == other.tipoDeFactura;
	}

	@Override
	public String toString() {
		return tipoDeFactura + ", puntoDeVenta=" + puntoDeVenta + ", num=" + num
				+ ", fecha=" + fecha + ", proveedor=" + proveedor + ", detalleFactura=" + detalleFactura
				+ ", importeTotal=" + importeTotal + "]";
	}

	// Establezca como criterio de comparación por defecto para la clase Factura los
	// datos:
	// Proveedor, Punto de Venta, Número de Factura.
	@Override
	public int compareTo(Factura o) {
		int rta = 0;

		if (this.getProveedor().compareTo(o.getProveedor()) == 0) {
			if (this.getPuntoDeVenta().compareTo(o.getPuntoDeVenta()) == 0) {
				rta = this.getNum().compareTo(o.getNum());
			}

			if (this.getProveedor().compareTo(o.getProveedor()) < 0) {
				rta = -1;
			} else {
				if (this.getProveedor().compareTo(o.getProveedor()) > 0) {
					rta = 1;
				}
			}
		}
		if (this.getProveedor().compareTo(o.getProveedor()) == 0) {
			if (this.getPuntoDeVenta().compareTo(o.getPuntoDeVenta()) < 0) {
				rta = -1;
			} else {
				if (this.getPuntoDeVenta().compareTo(o.getPuntoDeVenta()) > 0) {
					rta = 1;
				}
			}
		}

		return rta;
	}
}
