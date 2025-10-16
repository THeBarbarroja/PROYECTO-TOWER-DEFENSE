import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nombrejugador;
		String nombredebase;
		int opciontorre;
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
					torre = new Torre("Torre de flechas",100,15,20,nuevabase);
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
		System.out.println("justo a tiempo. Se acercan los enemigos.");
		Enemigo enemigo1 = new Enemigo("goblin",10, 5, 3);
		enemigo1.mostrarInfo();
		sc.nextLine();
		System.out.println("tus torre ya estan defendiendo tu base");
		torre.atacarEnemigo(enemigo1);
		enemigo1.mostrarInfo();
		sc.nextLine();
		System.out.println("¡¡¡¡VICTORIA!!!!!");
		System.out.println("pero viene mas enemigos");
		System.out.println("es hora de sacar el armamento pesado");
		System.out.println("LA TORRE DE FUEGO");
		
		System.out.println("¿quieres mejorar la torre de flechas a torre de fuego?");
		do {
			System.out.println("1)Mejorar torre");
			System.out.println("2)Mantener torre");
			if(sc.hasNextInt()) {
				opciontorre=sc.nextInt();
				sc.nextLine();
			}else {
				System.out.println("Error. Selecciona 1) Mejorar la torre a torre de fuego o 2) mantener la torre de flechas");
				sc.nextLine();
				opciontorre=0;
				continue;
			}
			switch (opciontorre) {
				case 1:
					System.out.println("Mejoraste la torre a torre de fuego");
					torre= new TorreFuego("Torre de fuego", 250, 20, 45,45, nuevabase);
					mapa.setTorre(torre);
				break;
				case 2:
					System.out.println("mantienes la torre de flechas");
					
				break;
			default:
					System.out.println("Error. Selecciona 1) Mejorar la torre a torre de fuego o 2) mantener la torre de flechas");
		
			}
		}while(opciontorre!=1 && opciontorre!=2);
		
		System.out.println("se aacercan mas enemigos");
		Enemigo enemigo2 = new Enemigo("Orco",20, 15,6);
		enemigo2.mostrarInfo();
		sc.nextLine();
		System.out.println("la torre ha iniciado el ataque contra los enemigos");
		torre.atacarEnemigo(enemigo2);
		enemigo2.mostrarInfo();
		mapa.mostrarInfo();
		System.out.println("¡¡¡¡VICTORIA!!!!!");
		
		System.out.println("esto fue el tutorial de tower defense");
		System.out.println("proximamente se van a agregar lootbox y skins a 9.99 para los gordos compus");
		System.out.println("gracias por probar tower defense");
		
		
}
}

