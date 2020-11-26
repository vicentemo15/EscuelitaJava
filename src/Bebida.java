
public class Bebida extends Producto {

	private double litros;

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public double getLitros() {
		return this.litros;
	}

	public Bebida(String nombre, int precio, double litros) {
		super(nombre, precio);
		this.litros = litros;
	}

	@Override
	public String toString() {
		return "Nombre: " + this.nombre + " /// Litros: " + this.litros + " /// Precio: $" + this.precio;
	}
}
