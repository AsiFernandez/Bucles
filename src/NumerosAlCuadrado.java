import java.util.Scanner;
import java.math.*;

public class NumerosAlCuadrado {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		int numero = 1;
		while(numero != 0) {
		System.out.println("Ingrese la base: ");
		numero = Scan.nextInt();
		
		int resultado = (int) Math.pow(numero, 2);
		System.out.println(numero + " elevado a la 2 es igual a " + resultado);
		}
		
		
		
	}

}

