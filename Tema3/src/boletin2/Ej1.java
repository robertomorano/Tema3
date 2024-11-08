package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida al usuario dos valores, tamaño y valor, y luego
		 * cree un array del tamaño dado y que almacene valor en todas sus posiciones.
		 * Luego muestra el array por pantalla.
		 */
		// Declarar variables
		int tamaño = 0;
		int valor = 0;
		
		// Se crea despues de pedir el valor para indicar el tamaño
		int numeros[];
		
		// crear escaner
		Scanner sc = new Scanner(System.in);
		
		// pedir numeros
		System.out.println("Dame un valor");
		valor = sc.nextInt();
		System.out.println("Dame un tamaño");
		tamaño = sc.nextInt();
		
		// darle el tamaño
		numeros = new int[tamaño];
		//Hacer el .fill
		Arrays.fill(numeros, valor);
		System.out.println(Arrays.toString(numeros));

	}

}
