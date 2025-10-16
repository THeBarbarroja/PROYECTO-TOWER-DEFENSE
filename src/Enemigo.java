
public class Enemigo {
	private String nombre;
	private int vida;
	private int daño;
	private double velocidad;
	
	public Enemigo(String nombre, int vida, int daño, double velocidad) {
		this.nombre = nombre;
		this.vida = vida;
		this.daño = daño;
		this.velocidad = velocidad;
		
	}
	public String getNombre() {
		return nombre;
	}
	public int getVida() {
		return vida;
	}
	public int getDaño() {
		return daño;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void recibirDaño(double Dañorecibido) {
		vida-=Dañorecibido;
		if(vida<0) 
			vida=0;
			daño=0;
			velocidad=0;
		if(vida==0)
		{System.out.println(nombre+ " ha sido derrotado");
		
		}else {
			{System.out.println(nombre+ " recibio "+Dañorecibido+" de daño.Vida restante " + vida);
			}
		}
	}
	
	public void mostrarInfo() {
		System.out.println("Enemigo: "+ nombre);
		System.out.println("vida: "+ vida);
		System.out.println("daño: "+ daño);
		System.out.println("velocidad: "+ velocidad);

	}

}
