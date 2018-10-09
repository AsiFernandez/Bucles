import java.util.Scanner;

public class MenuDoWhile {

	public static void main(String[] args) throws InterruptedException {

		Scanner Scan = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("----- BIENVENIDO AL PRIMER MENU -----");
			System.out.println(" QUE DESEA HACER");
			System.out.println("1- Cargar");
			System.out.println("2- Mostrar");
			System.out.println("3- Listar");
			System.out.println("4- Salir ");
			System.out.println("\n");
			
			
			opcion = Scan.nextInt();
			
			
			switch (opcion) {
			case 1: 
				System.out.println("Cargando programa");
				System.out.println("\n");
				break;
				
			case 2:
				System.out.println("Mostrando base de datos");
				System.out.println("\n");
				break;
			
			case 3: 
				System.out.println("Listando usuarios en el sistema");
				System.out.println("\n");
				break;
			
			case 4: 
				System.out.println("Saliendo del sistema...");
				System.out.println("\n");
			}
			
			
			
		}while(opcion != 4); {
			Thread.sleep(2000);
			System.out.println("Programa cerrado");
		}
		
		
	}

}
