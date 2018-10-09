import java.util.Scanner;


public class NumeroAlCuadrado {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Dame un numero y te lo calculare al cuadrado");
		numero = Scan.nextInt();
		
		while (numero != 0 ) {
			System.out.println(numero + " al cuadrado es : " + (int) Math.pow(numero, numero));
			
			System.out.println("Introduce otro numero");
			numero = Scan.nextInt();
			
			if(numero == 0 ) {
			System.out.println("Saliendo del programa");
		}
		}
		
	}

}
