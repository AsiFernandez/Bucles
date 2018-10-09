import java.util.Scanner;

public class SumasDoSwitchaCase {

	
	//Crea un programa que calcule y muestre el producto de dos números enteros que introduzca el usuario.
	
	public static void main(String[] args) {
		
		Scanner Scan  = new Scanner(System.in);
		int numero ;
		
		
		do {
			System.out.println("1- Calcular una suma");	
			System.out.println("2- Calcular una resta");
			System.out.println("3- Calcular una multiplicacion");
			System.out.println("4- Calcular una division");
			System.out.println("5- Calcular el resto de una division");
			System.out.println("6- Salir");
		
			numero = Scan.nextInt();
		
			switch (numero) {
		
				case 1:
					System.out.println("--- Programa para Calcular una suma --- ");	
				System.out.println("Introduce el primer numero");
				int numero1 = Scan.nextInt();
				System.out.println("Introduce el segundo numero");
				int numero2 = Scan.nextInt();
				System.out.println("La suma de los numeros es: " + (numero1 + numero2));
				
				break;
				
				case 2:
				System.out.println("--- Programa para calcular una resta --- ");
				System.out.println("introduce el primer numero");	
				int numero3 = Scan.nextInt();
				System.out.println("Introduce el segundo numero");
				int numero4 = Scan.nextInt();
				System.out.println("La resta de los numeros es: " + (numero3 - numero4));
				
				break;
				
				case 3:
				System.out.println("--- Programa para calcular una multiplicacion ---");
				
				System.out.println("introduce el primer numero");
				int numero5 = Scan.nextInt();
				System.out.println("Introduce el segundo numero");
				int numero6 = Scan.nextInt();
				
				System.out.println("La multiplicacion de los numeros es: " + (numero5 * numero6));
				
				break;
				
				case 4:
				System.out.println("--- Programa para calcular una division --- ");
				System.out.println("introduce el primer numero");
				int numero7 = Scan.nextInt();
				System.out.println("Introduce el segundo numero");
				int numero8 = Scan.nextInt();
				System.out.println("La division de los numeros es: " + (numero7 / numero8));
				
				break;
				
				case 5:
					System.out.println("--- Programa para calcular el resto de la division ---");
				System.out.println("introduce el primer numero");
				int numero9 = Scan.nextInt();
				System.out.println("Introduce el segundo numero");
				int numero10 = Scan.nextInt();
				System.out.println("el resto de los numeros es: " + (numero9 % numero10));
				
				break;
				
				case 6:
					System.out.println("Cerrando el programa");
				
				}
		}while (numero != 6); 
			System.out.println("Programa cerrado");
					
		}
	}


///*
//* suma simple 
//*/		
//System.out.print("La suma de 56 y 23 es: ");
//System.out.print(56+23);
//
//
///*
//* Suma con las variables definidas 
//*/




///*
//* Un programa de sumas bien creado y funcionando
//*/
//
//System.out.println("--- Bienvenido a el programa de sumas ---");
//System.out.println("introduce el primer numero por favor");
//int numero1 = Scan.nextInt();
//System.out.println("Introduce el segundo numero por favor");
//int numero2 = Scan.nextInt();
//
//System.out.println("la suma de tus numeros es = " + (numero1+numero2));
