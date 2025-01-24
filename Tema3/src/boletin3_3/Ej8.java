package boletin3_3;

import java.util.HashMap;
import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> diccionario= new HashMap<>();
		int num =0;
		int cont = 0;
		String clave = "";
		String valor = "";
		do {
		num=0;
		System.out.println("1 .Registro.\r\n"
				+ "2 .Login.\r\n"
				+ "0 .Salir. Termina el programa.");
		num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("Registrate NombreUsuario:");
			 clave=sc.next();
			 System.out.println("Pon la contraseña: ");
			 valor = sc.next();
			 diccionario.put(clave, valor);
			 System.out.println("Añadido con exito");
			break;
		case 2:
			System.out.println("Login usuario:");
			clave = sc.next();
			System.out.println("Contraseña: ");
			valor = sc.next();
			if (diccionario.containsKey(clave)) {
				if (diccionario.get(clave).equals(valor)) {
					System.out.println("Inicio de sesion correcto");
					}
			}else {
				cont++;
				System.out.println("Contraseña incorrecta");
			}
			break;
		default:
			break;
		}
		System.out.println(cont);
		clave="";
		valor = "";
		
		}while(num!=0 && cont<3);
	}


	}
