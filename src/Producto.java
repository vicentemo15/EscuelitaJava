
public class Producto implements Comparable<Producto> {

	protected String nombre;
	protected int precio;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPrecio() {
		return this.precio;
	}

	public Producto(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public int compareTo(Producto p) {

		if (this.precio > p.precio) {
			return 1;
		} else if (this.precio < p.precio) {
			return -1;
		} else {
			return 0;
		}
		
	}
}
