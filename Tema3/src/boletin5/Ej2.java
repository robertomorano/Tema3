package boletin5;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int LONGITUD = 6;
		int matriz[] = new int[LONGITUD];
		boolean simetrica;
		// varible para pedir al usuario
		int adivina = 0;
		// generar aleatoriamente la tabla
		matriz = generar(LONGITUD);
		matriz = desorden(matriz);
		System.out.println();
		for (int j = 0; j < matriz.length; j++) {
			// Usando el tabulador le doy forma a la tabla
			System.out.print(matriz[j] + " \t");
		}

	}

	static int[] generar(int longitud) {
		int t[];
		t = new int[longitud];
		for (int j = 0; j < t.length; j++) {
			// Cambiar valor matriz
			t[j] = (int) ((Math.random() * 11));
			// Usando el tabulador le doy forma a la tabla
			System.out.print(t[j] + " \t");
		}
		return t;
	}
	static int[] desorden(int t[]) {
		//Variable para la nueva posicion
		int posicion=0;
		//Varibae para guardar el valor anterior
		int x=0;
		for(int i=0;i<=(int)(t.length/2);i++) {
			posicion = (int) (Math.random() * (t.length/2)+(t.length/2));
			x=t[i];
			t[i]=t[posicion];
			t[posicion]=x;
		}
		return t;
	}

}
