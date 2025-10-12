
public class Mapa {
	private String nombre;
	private Base base; //COMPOSICION
	private Torre torre;//COMPOSICION
	
	public Mapa(String nombre, Base base, Torre torre) {
		this.nombre = nombre;
		this.base = base;
		this.torre = torre;
	}
	public void mostrarInfo() {
		System.out.println("Nombre del mapa: "+nombre);
		System.out.println("Informacion de base");
		base.mostrarInfo();
		System.out.println("----------------------");
		System.out.println("Informacion de torre");
		torre.mostrarInfo();
		System.out.println("----------------------");
		
	}

}
