package boletin_string;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String contrasena = "";
		String intento = "";
		String contar = "";
		int valor = 0;
		System.out.println("Introduce una frase");
		contrasena = sc.nextLine();
		System.out.println("Introduce una frase");
		intento = sc.nextLine();
//		//valor = contrasena.compareTo(intento);

		comparar(contrasena, intento);

		while (!contrasena.equals(intento)) {
			for (int i = 0; i < intento.length(); i++) {
				if (intento.charAt(i) == contrasena.charAt(i)) {
					contar += intento.charAt(i);
				} else {
					contar += "*";
				}
			}
			System.out.println(contar);
//			System.out.println(intento);
//			System.out.println(contrasena);
			intento = "";
			contar = "";
			System.out.println("Introduce una frase");
			intento = sc.nextLine();
			comparar(contrasena, intento);
		}
		System.out.println("Es correcto");
		sc.close();
	}

	static String adValor(String cadena, int valor) {
		String cadenaAum = cadena;
		for (int i = 0; i < valor; i++) {
			cadenaAum=  cadenaAum +"*";
		}
		System.out.println(cadenaAum.length());
		return cadenaAum;
	}

	static void comparar(String contrasena, String intento) {
		int valor = 0;
		if (intento.length() > contrasena.length()) {
			//Desde el inicio hasta el valor donde llegue
			intento = intento.substring(0, contrasena.length());
			
		} else {
			valor = contrasena.length() - intento.length();
			System.out.println(valor);
			System.out.println(intento.length());
			intento = adValor(intento, valor);
		}

	}

}
//while (valor != 0) {
//if (valor > 0) {
//	System.out.println("la contraseña es mayor alfabeticamente");
//} else {
//	System.out.println("la contraseña es menor alfabeticamente");
//}
//System.out.println("Introduce una frase");
//intento = sc.nextLine();
//valor = contrasena.compareTo(intento);
//}
