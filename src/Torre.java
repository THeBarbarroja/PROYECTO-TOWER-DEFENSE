public class Torre   { 
	protected String nombretorre;
	private int resistencia;
	private int distanciaataque;
	private double daño;
	private Base base;//ASOCIACION:Una clase usa a otra.(TORRE NECESITA DE BASE PERO BASE PUEDE EXISTIR SIN TORRE)
	protected Proyectil proyectil;//COMPOSICION: Una clase contiene a otra y controla totalmente su ciclo de vida.
	//Si se elimina el objeto principal, también se eliminan sus partes.(SI TORRE DESAPARECE TAMBIEN DESAPARECE PROYECTIL)
	public Torre(String nombretorre, int resistencia, int distanciaataque, double daño, Base base) {
		this.nombretorre = nombretorre;
		this.resistencia = resistencia;
		this.distanciaataque = distanciaataque;
		this.daño = daño;
		this.base = base;
		this.proyectil = new Proyectil("flechas", 9.0, 20.0,this); 
	}
	public void mostrarInfo() {
		System.out.println("Nombre de torre: "+ nombretorre);
		System.out.println("Resistencia de torre: "+ resistencia);
		System.out.println("Distancia de ataque: " +distanciaataque);
		System.out.println("Daño por segundo: "+ daño);
		System.out.println("Torre defendiendo la base: "+ base.getNombrebase());
		
	}
	public void atacarEnemigo(Enemigo enemigo) {//DEPENDENCIA
		System.out.println(nombretorre+"lanza"+proyectil.getTipo()+" contra  "+enemigo.getNombre());
		enemigo.recibirDaño(proyectil.getDaño());
		
		
	}
}