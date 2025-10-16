
public class TorreFuego extends Torre { //HERENCIA DE TORRE
private int dañoextra;

public TorreFuego(String nombretorre, int resistencia, int distanciaataque, double daño,int dañoextra, Base base) {
	super(nombretorre, resistencia, distanciaataque, daño, base);
	this.dañoextra=dañoextra;
	this.proyectil = new Proyectil("Bola de Fuego",10.0,25,this);

}
	public void atacarEnemigo(Enemigo enemigo) {
		
			System.out.println(nombretorre+"lanza"+proyectil.getTipo()+" contra  "+enemigo.getNombre());
			enemigo.recibirDaño(proyectil.getDaño());
			
			if(enemigo.getVida()>0) {
			enemigo.recibirDaño(dañoextra);
			System.out.println(nombretorre+" quema al enemigo "+dañoextra+" puntos de vida ");
		}
		
	}
	public void mostrarInfo() {
		super.mostrarInfo();//muestra datos de torre asi no escribis tanto. BUENISIMO ESTO!!!!
		System.out.println("Daño extra por fuego: "+dañoextra);
		
		
	}
}


