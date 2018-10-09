import java.util.Scanner;

public class LoginConIntentos {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		int login;
		int intentos = 1;
		
		
		System.out.println("Introduce el login");
		login = Scan.nextInt();
		
		while(login != 1234 && intentos <= 3 ) {
			
			System.out.println("has introducido mal la contraseñan, vuelve a intentarlo");
			System.out.println("numero de intentos " + intentos + " vuelve a intentarlo");
			
			intentos ++;
			
			System.out.println("Introduce el login");
			login = Scan.nextInt();
			
			
		}
		
		if(intentos <= 3){
			System.out.println("Bienvenido al sistema");
		}else {
			try {
				System.out.println("Sistema bloqueado cerrando el programa");
				Thread.sleep(2000);
				System.out.println("Programa cerrado");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
		
		

	}

}
