package boletin5;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int LONGITUD = 3;
		int matriz[][] = new int[LONGITUD][LONGITUD];
		// varible para pedir al usuario
		int adivina = 0;
		// generar aleatoriamente la tabla
		matriz = generar(LONGITUD);
		matriz = desorden(matriz);
		System.out.println();
		for (int j = 0; j < matriz.length; j++) {
			// Usando el tabulador le doy forma a la tabla
			for (int valor : matriz[j]) {
				System.out.print(valor + " \t");
			}
			System.out.println();
		}

	}

	static int[][] generar(int longitud) {
		int t[][];
		t = new int[longitud][longitud];
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				// Cambiar valor matriz
				t[i][j] = (int) ((Math.random() * 11));
				// Usando el tabulador le doy forma a la tabla
				System.out.print(t[i][j] + " \t");
			}
			System.out.println();
		}
		return t;
	}

	static int[][] desorden(int t[][]) {
		// Variable para la nueva posicion
		int posicion = 0;
		int posicion2 = 0;
		// Varibae para guardar el valor anterior
		int x = 0;
		for (int i = 0; i <= (int) (t.length / 2); i++) {
			for (int j = 0; j < t.length; j++) {
				posicion2 = (int) (Math.random() * (t.length));
				posicion = (int) (Math.random() * (t.length));
				x = t[i][j];
				t[i][j] = t[posicion][posicion2];
				t[posicion][posicion2] = x;
			}
		}
		return t;
	}

}
