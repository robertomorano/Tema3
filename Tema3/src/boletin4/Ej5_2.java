package boletin4;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5_2 {

	public static void main(String[] args) {
		// devuelve true
		int matriz[][];
		int longitud = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una longitud para una matriz cuadrada");
		longitud = sc.nextInt();
		matriz = generar(longitud);
		matriz=giro90(matriz);
		System.out.println(Arrays.deepToString(matriz));
	}
	static int[][] giro90(int t[][]){
		int tCopia[][]= new int [t.length][t.length];
		//patron que sigue j=i primera=ultima primera+1=ultima-1
		for(int i=0;i<t.length;i++) {
			for(int j=0;j<t.length;j++) {
				tCopia[j][(t.length-1)-i]=t[i][j];
			}
		}
		return tCopia;
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
