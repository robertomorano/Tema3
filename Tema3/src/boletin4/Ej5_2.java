package boletin4;

import java.util.Scanner;

public class Ej5_2 {

	public static void main(String[] args) {
		// devuelve true
		int matriz[][] = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };
		int longitud = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una longitud para una matriz cuadrada");
		longitud = sc.nextInt();
		matriz = generar(longitud);
		
	}
	static int[][] giro90(int t[][]){
		//patron que sigue j=i primera=ultima primera+1=ultima-1
		for(int i=0;i<t.length;i++) {
			for(int j=0;j<t.length;j++) {
				
			}
		}
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
}
