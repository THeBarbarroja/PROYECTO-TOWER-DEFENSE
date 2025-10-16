
public class TorreFuego extends Torre { //HERENCIA DE TORRE
private int dañoextra;

public TorreFuego(String nombretorre, int resistencia, int distanciaataque, double daño,int dañoextra, Base base) {
	super(nombretorre, resistencia, distanciaataque, daño, base);
	this.dañoextra=dañoextra;
	this.proyectil = new Proyectil("Bola de Fuego",10.0,25,this);

}
	public void atacarEnemigo(Enemigo enemigo) {
		super.atacarEnemigo(enemigo); 
		if(enemigo.getVida()>0) {
			enemigo.recibirDaño(dañoextra);
			System.out.println("La torre de fuego quema al enemigo por : "+dañoextra+"puntos de vida");
		}else {
			
		}
		
	}
	public void mostrarInfo() {
		super.mostrarInfo();//muestra datos de torre asi no escribis tanto. BUENISIMO ESTO!!!!
		System.out.println("Daño extra por fuego: "+dañoextra);
		
		
	}
}


