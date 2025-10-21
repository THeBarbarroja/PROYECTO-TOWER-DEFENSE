
public class Mapa {
	private String nombre;
	private Base base; //AGREGACION: mapa usa a base pero base puede existir por si sola
	private Torre torre;//AGREGACION: mapa usa a torre pero torre puede existir por si sola
	private String posicionTorre;
	
	//Una clase contiene a otra. Si se elimina el objeto principal, los contenidos pueden seguir existiendo.
	
	public Mapa(String nombre, Base base, Torre torre,String posicionTorre) {
		this.nombre = nombre;
		this.base = base;
		this.torre = torre;
		this.posicionTorre = posicionTorre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Base getBase() {
		return base;
	}

	public void setBase(Base base) {
		this.base = base;
	}

	public Torre getTorre() {
		return torre;
	}

	public void setTorre(Torre torre) {
		this.torre = torre;
	}

	public String getPosicionTorre() {
		return posicionTorre;
	}

	public void setPosicionTorre(String posicionTorre) {
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
