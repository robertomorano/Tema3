package boletin4;

import java.util.Scanner;

public class Ej3_2 {

	public static void main(String[] args) {
		//devuelve true
		int matriz[][]= {{1,2,3},{2,4,5},{3,5,6}};
		boolean simetrica;
		// generamos los valores de la matriz aleatoriamente
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Introduce una longitud para una matriz cuadrada");
//		longitud = sc.nextInt();
		//matriz = generar();
		simetrica = esSimetrica(matriz);
		System.out.println(simetrica);
	}

	static int[][] generar(int longitud) {
		int t[][];
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

	static boolean esSimetrica(int t[][]) {
		boolean simetrica=true;
		int i=0;
		int j=0;
		while(i<t.length&&simetrica) {
			if(t[i][j]==t[j][i]) {
				j++;
			}else {
				simetrica=false;
			}
			if(j==t.length-1) {
				j=0;
				i++;
			}
		}
		return simetrica;
	}

}
