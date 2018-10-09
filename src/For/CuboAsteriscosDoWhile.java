package For;
import java.util.Scanner;

public class CuboAsteriscosDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Scan = new Scanner(System.in);
		
		int medida ;
		int ancho = 1;
		int alto = 1; 
		
		
	
		System.out.println("Introduce la medida que tiene que tener el cubo ");
		medida = Scan.nextInt();
		

		do {
			
			ancho = 1;
				do {
					System.out.print("*");
					ancho++;
					
				}while(ancho <= medida);								
				
				System.out.println("");
				alto++;
			
			
		} while (alto <= medida);{}
		
		
		
//		int contador = 3;
//		int altura = 0;
//		int anchura = 0;
//	
//		System.out.println("introduce la anchura que tiene que tener el bloque ");
//		anchura = Scan.nextInt();
//		System.out.println("introduce la altura que tiene que tener el bloque ");
//		altura = Scan.nextInt();
//		
//		
//				do{
//					System.out.print("*");			
//					do {
//						System.out.print("*");
//						contador ++;
//						
//					} while (contador <= anchura);
//					
//					System.out.print("*");
//					contador++;
//				
//					
//				} while (contador <= altura);
			
		
		
		
		
		
		
		

	}

}
