package boletin4;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// Crear matriz
		int matriz[];
		int longitud = 0;
		// frecuencia de suma
		int frecuencia;
		
		// Pedir longitud
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una longitud");
		longitud = sc.nextInt();
		matriz = new int[longitud];
		
		matriz = generar(matriz);
		
		// Pedir frecuencia de suma
		System.out.println("Introduce el rango de suma");
		frecuencia = sc.nextInt();
		matriz = suma(matriz, frecuencia);
		
		System.out.println("Se ha encontrado en: " + Arrays.toString(matriz));
	}

	static int[] suma(int t[], int numElementos) {
		// numElementos - 1 para ajustarr el tamaño de la matriz que sigue este algoritmo
		int sum[] = new int[(t.length - (numElementos - 1))];
		for (int i = 0; i <= t.length - numElementos; i++) {
			for (int j = i; j < (i + numElementos); j++) {
				sum[i] += t[j];
			}
		}
		return sum;
	}

	static int[] generar(int t[]) {
		for (int j = 0; j < t.length; j++) {
			// Cambiar valor matriz
			t[j] = (int) ((Math.random() * 10 + 1));
			// Usando el tabulador le doy forma a la tabla
			System.out.print(t[j] + " \t");
		}
		return t;
	}

}
