import java.util.Scanner;

public class LoginConInteger {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		int usuariobien = 1809;
		int contrasenabien = 1234;
		int usuario;
		int contrasena;
		
		
		/*
		 * Ejercicio Resuelto con while
		 */
		
//		System.out.println("Introduce el usuario");
//		 usuario = Scan.nextInt();
//		
//		System.out.println("Introduce la contraseña");
//		 contrasena = Scan.nextInt();
//		
//		
//		while(usuario!=usuariobien ||contrasena!=contrasenabien) {
//			
//			
//				
//				if(usuario!=usuariobien && contrasena!=contrasenabien) {
//					System.out.println("Has introducido todo mal, vuelve a iniciar sesion");
//					
//					System.out.println("Introduce el usuario");
//					usuario = Scan.nextInt();
//					
//					System.out.println("Introduce la contraseña");
//					contrasena = Scan.nextInt();
//					
//				}else if(usuario!=usuariobien) {
//					System.out.println("Solo has introducido el usuario mal");
//					
//					System.out.println("Introduce el usuario");
//					usuario = Scan.nextInt();
//					
//				}else {
//					System.out.println("Solo has introducido mal la contraseña");
//					
//					System.out.println("Introduce la contraseña");
//					 contrasena = Scan.nextInt();
//				}
//						
//		} if(usuario==usuariobien && contrasena==contrasenabien) {
//			
//			System.out.println("Bienvenido al sistema");
//				}
		
		/*
		 * Ejercicio resuelto con Do-While
		 */
		
		do {
			System.out.println("Introduce el usuario");
			usuario = Scan.nextInt();
			
			System.out.println("Introduce la contraseña");
			contrasena = Scan.nextInt();
			
			if(usuario!=usuariobien && contrasena!=contrasenabien) {
				System.out.println("Has introducido todo mal, vuelve a iniciar sesion");
				
				System.out.println("Introduce el usuario");
				usuario = Scan.nextInt();
				
				System.out.println("Introduce la contraseña");
				contrasena = Scan.nextInt();
				
			}else if(usuario!=usuariobien) {
				System.out.println("Solo has introducido el usuario mal");
				
				System.out.println("Introduce el usuario");
				usuario = Scan.nextInt();
				
			}else {
				System.out.println("Solo has introducido mal la contraseña");
				
				System.out.println("Introduce la contraseña");
				 contrasena = Scan.nextInt();
			}
			
		}while(usuario == usuariobien && contrasena == contrasenabien);{
			
		}
		
		
	}
	}


