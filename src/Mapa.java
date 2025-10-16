
public class Mapa {
	private String nombre;
	private Base base; //AGREGACION
	private Torre torre;//AGREGACION
	private String posicionTorre;
	
	public Mapa(String nombre, Base base, Torre torre,String posicionTorre) {
		this.nombre = nombre;
		this.base = base;
		this.torre = torre;
		this.posicionTorre = posicionTorre;
	}
	public void mostrarInfo() {
		System.out.println("Nombre del mapa: "+nombre);
		System.out.println("Informacion de base");
		base.mostrarInfo();
		System.out.println("----------------------");
		System.out.println("Informacion de torre");
		torre.mostrarInfo();
		System.out.println("la posicion de la torre es la "+posicionTorre);
		System.out.println("----------------------");
		
		
	}

}
