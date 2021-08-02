package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Supermercado {

	private List<Producto> productos=null;

	public Supermercado() {
		super();
		this.productos = new ArrayList<Producto>();
	}
	
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	@Override
	public String toString() {
		return "Productos:\n"+productos;
	}

	public void agregarFruta(String nombre, int precio, String unidadDeVenta) {
		productos.add(new Fruta(nombre, precio, unidadDeVenta));
	}
	
	public void agregarGaseosa(String nombre, int precio, float litros) {
		productos.add(new Gaseosa(nombre, precio, litros));
	}
	
	public void agregarShampoo(String nombre, int precio, int contenido) {
		productos.add(new Shampoo(nombre, precio, contenido));
	}
	
	public void agregarProductos() {
		agregarGaseosa("Coca-Cola Zero",20,1.5f);
		agregarGaseosa("Coca-Cola",18,1.5f);
		agregarShampoo("Shampoo Sedal",19,500);
		agregarFruta("Frutillas",64,"kilo");
	}
	
	public String precioMaxYMin() {
		String max,min;
		max=Collections.max(productos).getNombre();	//obtengo el precio maximo de la lista
		min=Collections.min(productos).getNombre(); //obtengo el precio minimo de la lista
		return"=============================\nProducto más caro: "+max+"\nProducto más barato: "+min;
	}
	
	public void traerProductos() {
		for (Producto producto : productos) {
			System.out.println(producto.toString());
		}
	}
	

}
