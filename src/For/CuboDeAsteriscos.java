package For;
import java.util.Scanner;


public class CuboDeAsteriscos {
	public static void main(String[] args) {
		
		
		Scanner Scan = new Scanner(System.in);
		
		/*
		 * Un cuadrado de misma anchura y altura
		 */
		
		
		int asteriscos;
		
		System.out.println("introduce la altura que tiene que tener el bloque ");
		asteriscos = Scan.nextInt();
		
		
		for(int i = 0; i < asteriscos; i++) {
			for(int j = 1; j < asteriscos ; j++) {
				System.out.print("*");
			}			
			System.out.println("*");
		}
		
		
		
		
		/*
		 * un cuadrado en el que tu decides la altura y la anchura
		 */
		
		
		System.out.println("introduce la altura que tiene que tener el bloque ");
		int altura = Scan.nextInt();
		System.out.println("introduce anchura que tiene que tener el bloque ");
		int anchura = Scan.nextInt();
		
		for(int i = 0; i < anchura; i++) {
			for(int j = 1; j < altura ; j++) {
				System.out.print("*");
			}			
			System.out.println("*");
		}
		
		
	}
}
