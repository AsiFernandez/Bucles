package For;

import java.util.Scanner;

public class DivisoresDeUnNumero {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Introduce un numero para saber sus divisores");
		int numero = Scan.nextInt();
		
		
		for (int i = 1 ; i <= numero ; i++)
	            if (numero % i == 0)
	                System.out.println (i);
	    
		
	}

}
