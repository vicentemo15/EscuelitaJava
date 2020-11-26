
public class Fruta extends Producto {

	private String unidadVenta;

	public void setUnidadVenta(String unidadVenta) {
		this.unidadVenta = unidadVenta;
	}

	public String getUnidadVenta() {
		return this.unidadVenta;
	}

	public Fruta(String nombre, int precio, String unidadVenta) {
		super(nombre, precio);
		this.unidadVenta = unidadVenta;
	}

	@Override
	public String toString() {
		return "Nombre: " + this.nombre + " /// Precio: $" + this.precio + " /// Unidad de venta: " + this.unidadVenta;
	}
}