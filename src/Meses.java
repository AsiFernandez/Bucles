import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scan  = new Scanner(System.in);
		int numero ;
		
		
		do {
			System.out.println("1- ");	
			System.out.println("2- ");
			System.out.println("3- ");
			System.out.println("4- ");
			System.out.println("5- ");
			System.out.println("6- ");
			System.out.println("7- ");	
			System.out.println("8- ");
			System.out.println("9- ");
			System.out.println("10- ");
			System.out.println("11- ");
			System.out.println("12- ");
			System.out.println("13- Salir");
			
			numero = Scan.nextInt();
		
			switch (numero) {
		
				case 1:
					System.out.println("Enero");	
				break;
				
				case 2:
					System.out.println("Febrero");
				break;
				
				case 3:
					System.out.println("Marzo");				
				break;
				
				case 4:
					System.out.println("Abril");
				break;
				
				case 5:
					System.out.println("Mayo");
				break;
				
				case 6:
					System.out.println("Junio");
				break;
				
				case 7:
					System.out.println("Julio");	
				break;
				
				case 8:
					System.out.println("Agosto");
				break;
				
				case 9:
					System.out.println("Septiembre");				
				break;
				
				case 10:
					System.out.println("Octubre");
				break;
				
				case 11:
					System.out.println("Noviembre");
				break;
				
				case 12:
					System.out.println("Diciembre");
				break;
				
				case 13:
					System.out.println("Saliendo del programa");
				break;
				
				
				}
		}while (numero != 13); 
			System.out.println("Programa cerrado");
					
		}
	}
