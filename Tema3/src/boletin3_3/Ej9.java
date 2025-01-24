package boletin3_3;

import java.util.HashMap;
import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> numeros = new HashMap<>();
		HashMap<Integer, Integer> estrellas = new HashMap<>();
		int oldValue = 0;
		int cont = 0;
		int clave = 0;
		int valor = 0;
		for (int i = 0; i < 6; i++) {
			System.out.println("Dame el numero de letras");
			clave = sc.nextInt();
			if (numeros.get(clave) != null) {
				oldValue = numeros.get(clave);
				numeros.replace(clave, oldValue, oldValue + 1);
			} else {
				numeros.put(clave, 1);
			}
		}
		for (int i = 0; i < 2; i++) {
			System.out.println("Dame las estrellas");
			clave = sc.nextInt();
			if (estrellas.get(clave) != null) {
				oldValue = estrellas.get(clave);
				estrellas.replace(clave, oldValue, oldValue + 1);
			} else {
				estrellas.put(clave, 1);
			}
		}
		System.out.println(numeros + " blablabla " +estrellas);
		
	}

}
