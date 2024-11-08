package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// Se crea los array
		int primeros[] = new int[10];
		int ultimos[] = new int[10];
		// variable paa dar valor
		int valor = 0;
		// crear escaner
		Scanner sc = new Scanner(System.in);
		// pedir numeros
		for (int i=0; i < primeros.length; i++) {
			System.out.println("Dame un valor");
			//valor=sc.nextInt();
			primeros[i]=valor;
		}
		for (int i=0; i < primeros.length; i++) {
			System.out.println("Dame un valor");
			//valor=sc.nextInt();
			ultimos[i]=valor;
		}
		System.out.println(Arrays.equals(primeros,ultimos));
		System.out.println(Arrays.toString(primeros));
		System.out.println(Arrays.toString(ultimos));

	}

}
