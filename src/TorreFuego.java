
public class TorreFuego extends Torre { //herencia de torre
private int dañoextra;

public TorreFuego(String nombretorre, int resistencia, int distanciaataque, double daño, Base base) {
	super(nombretorre, resistencia, distanciaataque, daño, base);

}
	public void atacarEnemigo(Enemigo enemigo) {
		super.atacarEnemigo(enemigo); 
		enemigo.recibirDaño(dañoextra);
		System.out.println("La torre de fuego quema al enemigo por : "+dañoextra+"puntos de vida");
	}
	public void mostrarInfo() {
		super.mostrarInfo();//muestra datos de torre asi no escribis tanto. BUENISIMO ESTO!!!!
		System.out.println("Daño extra por fuego: "+dañoextra);
		
		
	}
}


