
public class TorreFuego extends Torre { //herencia de torre
private int dañoextra;

public TorreFuego(String nombretorre, int resistencia, int distanciaataque, double daño,int dañoextra, Base base) {
	super(nombretorre, resistencia, distanciaataque, daño, base);
	this.dañoextra=dañoextra;

}
	public void atacarEnemigo(Enemigo enemigo) {
		if(enemigo.getVida()>0) {
			super.atacarEnemigo(enemigo); 
			enemigo.recibirDaño(dañoextra);
			System.out.println("La torre de fuego quema al enemigo por : "+dañoextra+"puntos de vida");
		}else {
			System.out.println("El enemigo ha sido derrotado");
		}
		
	}
	public void mostrarInfo() {
		super.mostrarInfo();//muestra datos de torre asi no escribis tanto. BUENISIMO ESTO!!!!
		System.out.println("Daño extra por fuego: "+dañoextra);
		
		
	}
}


