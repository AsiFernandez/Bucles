import java.util.Scanner;

public class NumeroHastaQueSea0 {
	public static void main(String[] args)  {
		
		Scanner Scan = new Scanner(System.in);
				
		int numero ;
		
		System.out.println("Introduce un numero");
		numero = Scan.nextInt();
		
		
		while (numero != 0){
			System.out.println("el numero introducido es " + numero);
			System.out.println("Introduce un numero");
			numero = Scan.nextInt();
		}
		System.out.println("Cerrando programa... ");
		try {
			Thread.sleep(2000);
			System.out.println("Programa cerrado");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
