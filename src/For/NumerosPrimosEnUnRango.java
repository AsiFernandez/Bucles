package For;

import java.util.Scanner;

public class NumerosPrimosEnUnRango {

	public static void main(String[] args) {
		
		//Hallar números primos con un rango inicial y final.
		
		Scanner Scan = new Scanner(System.in);
		
		  int i,j;
		  boolean esPrimo;
		  
		  System.out.println("Introduce el primer numero del rango del que quieras empezar");
		  int rInicial = Scan.nextInt();
		  System.out.println("introduce el ultimo numero del rango que quieras empezar");
		  int rFinal = Scan.nextInt();
		  
		  for(i = rInicial;i <= rFinal;i++){
		  
		      esPrimo=true;
		       for(j = 2;j < i;j++){
		       
		       if(i % j == 0){
		          esPrimo = false;
		       }
		       }
		       if(esPrimo){
		        System.out.println(i+"\n");
		       }
		  }
		 }
		}
	


