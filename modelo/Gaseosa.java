package modelo;

public class Gaseosa  extends Producto{

	private float litros;

	public Gaseosa(String nombre, int precio, float litros) {
		super(nombre, precio);
		this.litros = litros;
	}

	public float getLitros() {
		return litros;
	}

	public void setLitros(float litros) {
		this.litros = litros;
	}

	@Override
	public String toString() {
		return "Nombre: "+nombre+" /// "+"Litros: "+litros+" /// "+"Precio: $"+precio;
	}



	
	
}
