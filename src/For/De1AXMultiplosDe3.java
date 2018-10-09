package For;

import java.util.Scanner;

public class De1AXMultiplosDe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scan = new Scanner(System.in);
		System.out.println("introduce el numero tope a calcular");
		int tope = Scan.nextInt();
		
		for(int i=0; i <= tope ; i++) {
			if (i%3==0) {
				System.out.println(i);
			}
		}
	}

}
