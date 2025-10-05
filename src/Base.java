
public class Base {
	
	private String nombrebase;
	private int resistenciabase;
	
	public Base(String nombrebase, int resistenciabase) {
		this.nombrebase = nombrebase;
		this.resistenciabase = resistenciabase;
		
	}
	
	
	public String getNombrebase() {
		return nombrebase;
	}
	public int getResistenciabase() {
		return resistenciabase;
	}
	public void mostrarInfo() {
		System.out.println("Nombre de tu base"+nombrebase);
		System.out.println("resistencia de tu base"+resistenciabase);
	}
}