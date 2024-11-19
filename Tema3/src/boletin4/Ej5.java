package boletin4;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {
	static int numVeces(int t[], int clave) {
		int cont = 0;
		
		for (int j = 0; j < t.length; j++) {
			// Cambiar valor matriz
			t[j] = (int) ((Math.random() * 10 + 1));
			// Usando el tabulador le doy forma a la tabla
			System.out.print(t[j] + " \t");
			if (clave == t[j]) {
				cont++;
			}
		}
		if (cont > 0) {

		} else {
			cont = 0;
		}
		return cont;
	}
	static int[] buscarTabla(int t[], int clave) {
		int indices[];
		int rango=0;
		int cont=0;
		rango=numVeces(t, clave);
		indices = new int[rango];
			for (int i=0;i<=rango;i++) {
				if (t[i]==clave) {
					indices[cont]=i;
					cont++;
				}
			}
		return indices;
	}

	public static void main(String[] args) {
		int matriz[];
		int logitud;
		int clave = 0;
		int indice[];
		// iniciar escaner
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una longitud");
		logitud = sc.nextInt();
		System.out.println("Introduce el numero a buscar");
		clave = sc.nextInt();
		matriz = new int[logitud];
		indice = buscarTabla(matriz, clave);
		System.out.println("Se ha encontrado en: " + Arrays.toString(indice));

	}

}
