package boletin5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int LONGITUD=3;
		int matriz[][] = new int [LONGITUD][LONGITUD] ;
		boolean simetrica;
		//varible para pedir al usuario
		int adivina=0;
		//generar aleatoriamente la tabla
		matriz = generar(LONGITUD);
		
		do {
			try {
				// le pido un número al usuario
				System.out.println("Introduce un numero entre 0 y 10");
				adivina = sc.nextInt();
				assert adivina >= 0 : "entre 0 y 10";
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.err.println("Debe introducir un número entero");
			} finally {
				sc.next();
			}
		} while (adivina < 1||adivina>10);
		simetrica = esta(matriz, adivina);
		System.out.println(simetrica);
	}
	static boolean esta(int t[][], int intento) {
		boolean encuentra= false;
		int i = 0;
		int j=0;
		//Recorre la tabla hasa que no encuentre el numero intento
		while(i<t.length&&!encuentra) {
			if (intento==t[i][j]) {
				encuentra=true;
			}
			j++;
			if (j== t[i].length-1) {
			i++;
			j=0;
			}
		}
		return encuentra;
		}
	static int[][] generar(int longitud) {
		int t[][];
		t = new int[longitud][longitud];
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				// Cambiar valor matriz
				t[i][j] = (int) ((Math.random() * 11));
				// Usando el tabulador le doy forma a la tabla
				//System.out.print(t[i][j] + " \t");
			}
			//System.out.println();
		}
		return t;
	}
}
