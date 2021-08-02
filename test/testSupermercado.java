package test;

import modelo.Supermercado;

public class testSupermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supermercado supermercado = new Supermercado();
		supermercado.agregarProductos();
		supermercado.traerProductos();
		System.out.println(supermercado.precioMaxYMin());
	}

}
