import java.util.Scanner;

public class NumerosHasta0YSumarlos {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		int suma = 0;
		int numero;
		
		System.out.println("Introduce un numero");
		numero = Scan.nextInt();
		
		while (numero != 0) {
			
			suma = suma + numero;
			System.out.println("la suma total de los numeros introducidos es de: " + suma);
			System.out.println("Introduce un numero");
			numero = Scan.nextInt();
			
		}
		try {
			System.out.println("Cerrando programa... ");
			Thread.sleep(2000);
			System.out.println("Programa cerrado");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
