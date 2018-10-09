package For;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		int contador = 0;
		System.out.println("introduce un numero para saber si es primo o no");
		int numero = Scan.nextInt();
		
		for (int i = 1 ; i <= numero ; i++)
            if (numero % i == 0) {
                contador ++;
            }
		
		if(contador == 2) {
			System.out.println("El numero introducido es primo");
		}else {
			System.out.println("El numero introducido no es primo");
		}
		
				
		
		

	}

}
