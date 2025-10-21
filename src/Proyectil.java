
public class Proyectil {
	private String tipo;
	private double velocidad;
	private double daño;
	private Torre torre;//ASOCIACION:Una clase usa a otra.
	
	public Proyectil(String tipo, double velocidad, double daño,Torre torre) {
		this.tipo = tipo;
		this.velocidad = velocidad;
		this.daño = daño;
		this.torre = torre;
	}
	public String getTipo() {
		return tipo;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public double getDaño() {
		return daño;
	}
	public void mostrarInfo() {
		System.out.println("Tipo de proyectil: "+tipo);
		System.out.println("Velocidad de proyectil: "+velocidad);
		System.out.println("daño: "+daño);
	}

}
