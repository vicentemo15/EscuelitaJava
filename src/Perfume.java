
public class Perfume extends Producto {

	private String contenido;

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getContenido() {
		return this.contenido;
	}

	public Perfume(String nombre, int precio, String contenido) {
		super(nombre, precio);
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Nombre: " + this.nombre + " /// Contenido: " + this.contenido + " /// Precio: $" + this.precio;
	}
}
