
public class Jugador {
	private String nombre;

	public Jugador(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void mostrarInfo() {
		System.out.println("nombre de jugador: "+nombre);
	}

}
