
public class TorreFuego extends Torre { //HERENCIA DE TORRE:permite crear clases hijas que heredan atributos y métodos de una clase padre.
private int dañoextra;

public TorreFuego(String nombretorre, int resistencia, int distanciaataque, double daño,int dañoextra, Base base) {
	super(nombretorre, resistencia, distanciaataque, daño, base);
	this.dañoextra=dañoextra;
	this.proyectil = new Proyectil("Bola de Fuego",10.0,25,this);
	//COMPOSICION: TORRE FUEGO CONTIENE PROYECTIL
	//Una clase contiene a otra y controla totalmente su ciclo de vida.
	//Si se elimina el objeto principal, también se eliminan sus partes.
}
	public void atacarEnemigo(Enemigo enemigo) {//DEPENDENCIA: una clase usa a otra de forma temporal, solo mientras se ejecuta un método.
			System.out.println(nombretorre+"lanza"+proyectil.getTipo()+" contra  "+enemigo.getNombre());
			enemigo.recibirDaño(proyectil.getDaño());
			if(enemigo.getVida()>0) {
			enemigo.recibirDaño(dañoextra);
			System.out.println(nombretorre+" quema al enemigo "+dañoextra+" puntos de vida ");
		}//POLIMORFISMO: permite que un mismo método se comporte distinto según la clase que lo use.
		
	}
	public void mostrarInfo() {
		super.mostrarInfo();//HERENCIA:LLAMA AL METODO DE LA CLASE PADRE.el super muestra datos de torre asi no escribis tanto. BUENISIMO ESTO!!!!
		System.out.println("Daño extra por fuego: "+dañoextra);
		
		
	}
}


