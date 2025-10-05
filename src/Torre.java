public class Torre   { 
	private String nombretorre;
	private int resistencia;
	private int distanciaataque;
	private double daño;
	private Base base;//ASOCIACION(TORRE NECESITA A BASE)
	
	public Torre(String nombretorre, int resistencia, int distanciaataque, double daño, Base base) {
		this.nombretorre = nombretorre;
		this.resistencia = resistencia;
		this.distanciaataque = distanciaataque;
		this.daño = daño;
		this.base = base;
	}
	public void mostrarInfo() {
		System.out.println("Nombre de torre: "+nombretorre);
		System.out.println("Resistencia de torre: "+resistencia);
		System.out.println("Distancia de ataque: "+distanciaataque);
		System.out.println("Daño por segundo: "+daño);
		
	}
}