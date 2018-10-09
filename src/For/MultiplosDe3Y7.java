package For;
import java.util.Scanner;

public class MultiplosDe3Y7 {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		//Ejercicio resuelto con los numeros del 0 Al que tu le digas
		
//	       System.out.println("introduce el numero maximo a calcular");
//	        int maximo = Scan.nextInt();
//	        
//	        for (int i=1; i<maximo; ++i) {
//	            if (i%3 == 0 || i%7 == 0) {
//	            	System.out.println(i);
//	            }
//	        };
	        
	        
	        //Ejercicio resulto Con el numero por el que empiza y termina
		
			System.out.println("introduce el numero minimo a calcular");
	        int minimo = Scan.nextInt();
	        System.out.println("introduce el numero maximo a calcular");
	        int maximo = Scan.nextInt();
	       
	        for (int i=minimo; i<maximo; ++i) {
	            if (i%3 == 0 && i%7 == 0) {
	            	System.out.println(i);
	            }
	        };
	        
	    
		
		

	}

}
