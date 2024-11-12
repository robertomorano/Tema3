package boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// inicializacion del array
		int combWin[] = {2, 12,22,33,36,42};
		// array normal
		int combinacion[] = new int[6];
		// Contador
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < combinacion.length; i++) {
			combinacion[i] = (int) (Math.random() * 49 + 1);
		}
		Arrays.sort(combinacion);
		// si la combinacion es igual sale ganador
		if(combWin.equals(combinacion)) {
			System.out.println(Arrays.toString(combWin));
			System.out.println(" HAs ganado");
		}else {
			System.out.println(Arrays.toString(combWin));
			System.out.println(" era la combinacion la tuya es: ");
			System.out.println(Arrays.toString(combinacion));

		}
		
	}

}
