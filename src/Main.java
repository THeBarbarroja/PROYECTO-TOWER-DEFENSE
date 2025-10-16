import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nombrejugador;
		String nombredebase;
		String posicionTorre = null;
		Torre torre = null;
		
		int opcion=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("BIENVENIDO AL TUTORIAL DE TOWER DEFENCE");
		System.out.println("ingresa tu nombre para continuar");
		do {
			nombrejugador =sc.nextLine();
		if(nombrejugador.trim().isEmpty()) {
			System.out.println("no ingresaste un nombre. Intentalo de nuevo");
		}
		}while(nombrejugador.trim().isEmpty());
		Jugador jugador = new Jugador(nombrejugador);
		System.out.println("hola "+nombrejugador+". Es hora de defender tu base");
		
		System.out.println("ingresa el nombre de tu base");
		do {
			nombredebase =sc.nextLine();
		if(nombredebase.trim().isEmpty()) {
			System.out.println("no ingresaste un de tu base. Intentalo de nuevo");
		}
		}while(nombredebase.trim().isEmpty());
		Base nuevabase = new Base(nombredebase,1000);
		System.out.println("tu base principal se llama "+nombredebase);
		System.out.println("TE PASASTE CON LOS NOMBRES PIPO");
		System.out.println("es hora de defender tu base. Los enemigos estan cerca");
		System.out.println("presiona una tecla para continuar");
		sc.nextLine();
		
		System.out.println("como nunca jugaste un tower defense y esto es un tutorial");
		System.out.println("solo podras elegir una de las dos posiciones. Norte o Sur");
		System.out.println("selecciona una de estas dos opciones");
		
		do {
			System.out.println("1)posicion Norte");
			System.out.println("2)posicion Sur");
			if(sc.hasNextInt()) {
				opcion=sc.nextInt();
				sc.nextLine();
			}else {
				System.out.println("Error. Selecciona 1) la posicion Norte o 2) la posicion Sur ");
				sc.nextLine();
				opcion=0;
				continue;
			}
			switch (opcion) {
				case 1:
					System.out.println("seleccionaste la posicion Norte");
					torre = new Torre("Torre de flechas",100,15,15,nuevabase);
					posicionTorre = "posicion Norte";
				break;
				case 2:
					System.out.println("seleccionaste la posicion Sur");
					torre = new Torre("Torre de flechas",100,15,15,nuevabase);
					posicionTorre = "posicion Sur";
				break;
			default:
					System.out.println("Error. Solo puedes elegir la posicion norte o la posicion sur");
		}
		}while(opcion!=1 && opcion!=2);
			
		Mapa mapa = new Mapa("Tutorial", nuevabase,torre,posicionTorre);
		System.out.println("----------------------");
		mapa.mostrarInfo();
		System.out.println("----------------------");
		System.out.println("justo a tiempo. Se acercan los enemigos. Y tus torre ya estan defendiendo tu base");
		Enemigo enemigo1 = new Enemigo("goblin",10, 5, 3);
		torre.atacarEnemigo(enemigo1);
		enemigo1.mostrarInfo();
	}
	
}


