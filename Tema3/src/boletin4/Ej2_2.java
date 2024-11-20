package boletin4;

import java.util.Scanner;

public class Ej2_2 {
	public static void main(String[] args) {
		int matriz[][] = null;
		int traspuesta[][];
		// generamos los valores de la matriz aleatoriamente
		matriz = generar(matriz);
		traspuesta = new int[matriz.length][matriz.length];
		traspuesta = trasponer(matriz);
		//imprimir por pantalla dandole forma
		for (int i = 0; i < traspuesta.length; i++) {
			for (int value : traspuesta[i]) {
				System.out.print(value+",\t");
			}
			System.out.println();
		}
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
			System.out.println();
		}
		return t;
	}

	static int[][] trasponer(int t[][]) {
		int matrizT[][] = new int[t.length][t.length];
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				matrizT[j][i] = t[i][j];
			}
		}
		return matrizT;
	}
}
