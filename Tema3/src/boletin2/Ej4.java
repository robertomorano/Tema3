package boletin2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		// inicializacion del array
		int puntuacion[] = new int[8];
		int puntuacionInversa[] = new int[8];
		int valor = 0;

		// Iniciar escaner
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < puntuacion.length; i++) {
			do {
				try {
					// le pido un número al usuario
					System.out.println("Introduzca un número entre 1000 y 2800:");
					valor = sc.nextInt();
					//Comprobamos posibles errores
					assert (valor <= 1000) || (valor >= 2800) : "Debe introducir un número entre 1000 y 2800";
				} catch (AssertionError e) {
					System.err.println(e.getMessage());
				} catch (InputMismatchException e) {
					System.err.println("Debe introducir un número entero");
				}
			} while (!(valor >= 1000) && (valor <= 2800));
			puntuacion[i] = valor;
		}
		Arrays.sort(puntuacion);
		System.out.println("[");
			for(int j =0;j<puntuacionInversa.length-1;j++) {
				System.out.println(puntuacion[j]+",");
			}
		System.out.println(puntuacion[0]+"]");
		System.out.println(Arrays.toString(puntuacionInversa));
	}

}