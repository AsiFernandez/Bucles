import java.util.Scanner;

public class SumaDosNumerosHasta0 {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		int suma  = 0;
		do {
			System.out.println("introduce un numero");
			numero1 = Scan.nextInt();
			System.out.println("introduce el segundo numero");
			numero2 = Scan.nextInt();
			
			suma = numero1 + numero2;
			
			
			
			if(numero1 != 0 && numero2 != 0) {
				System.out.println("La suma de tus numeros es de: " + suma);
			}
			
		}while(numero1 != 0 && numero2 != 0);
		try {
			System.out.println("Cerrando el programa");
			Thread.sleep(2000);
			System.out.println("Programa cerrado");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
