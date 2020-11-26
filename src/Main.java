
public class Main {

	public static void main(String[] args) {

		Producto misProductos[] = new Producto[4];

		misProductos[0] = new Bebida("Coca-Cola Zero", 20, 1.5);
		misProductos[1] = new Bebida("Coca-Cola", 18, 1.5);
		misProductos[2] = new Perfume("Shampoo Sedal", 19, "500ml");
		misProductos[3] = new Fruta("Frutillas", 64, "kilo");

		Producto minProducto = misProductos[0];
		Producto maxProducto = misProductos[0];

		for (Producto p : misProductos) {

			if (p.compareTo(minProducto) < 0) {
				minProducto = p;
			}
			if (p.compareTo(maxProducto) > 0) {
				maxProducto = p;
			}
			
			System.out.println(p.toString());
		}

		System.out.println("=============================");
		System.out.println("Producto más caro: " + maxProducto.getNombre());
		System.out.println("Producto más barato: " + minProducto.getNombre());
	}

}
