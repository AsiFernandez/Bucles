import java.util.Scanner;

public class TablasDeMultiplicar {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		int numero = 1;
		int numTabla;
		
		/*
		 * Ejercicio resuelto con un while
		 */
		
//		System.out.println("Introduce el numero de la tabla que quieres que mostremos");
//		numTabla  = Scan.nextInt();
//		
//		while(numero <= 10 ) {
//			
//			System.out.println(numTabla + " * " + numero + " = " + (numTabla * numero));
//			numero++;
//			
//		}
		
		
		
		/*
		 * Ejercicio resuelto con un do-while
		 */
		
		System.out.println("Introduce el numero de la tabla que quieres que mostremos");
		numTabla  = Scan.nextInt();
		do {
			
		
			System.out.println(numero + " * " + numTabla + " = " + (numero * numTabla));
			numero ++;
			
		}while(numero <= 10) ; {
		
			
			
		}
		
		

	}

}
