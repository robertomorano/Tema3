package boletin4;

import java.util.Scanner;

public class Ej1_2 {
	public static void main(String[] args) {
		int matriz[][] = null;
		int mayorMenor[] = new int[2];
		// generamos los valores de la matriz aleatoriamente
		matriz = generar(matriz);
		mayorMenor = maxMin(matriz);
		System.out.println("El mmenor es: "+ mayorMenor[0]+ " El mayor es: "+ mayorMenor[1]);
	}

	static int[] maxMin(int matriz[][]) {
		int comprobar[] = new int[2];
		comprobar[0] = matriz[0][0];
		comprobar[1] = matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > comprobar[1]) {
					comprobar[1] = matriz[i][j];
				}
				if (matriz[i][j] < comprobar[0]) {
					comprobar[0] = matriz[i][j];
				}
			}
		}
		return comprobar;
	}

	static int[][] generar(int t[][]) {
		int longitud;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una longitud para una matriz cuadrada");
		longitud = sc.nextInt();
		t = new int[longitud][longitud];
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				// Cambiar valor matriz
				t[i][j] = (int) ((Math.random() * 1001));
				// Usando el tabulador le doy forma a la tabla
				System.out.print(t[i][j] + " \t");
			}
		}
		return t;
	}
}
