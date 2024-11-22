package boletin4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class AceptaElReto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] valor = new int[6];
		List<int[]> cuentas = new ArrayList<int[]>();
		int op;
		int i = 0;
		do {
			i = 0;
			System.out.println("Desea salir? Presione (-1)");
			while (i < valor.length && valor[0] != -1) {
				System.out.println("Dia: " + i);
				valor[i] = sc.nextInt();
				i++;
			}
			cuentas.add(valor);
		} while (valor[0] != -1);
		for (int[] a : cuentas) {
			for (int b : a) {
				System.out.println(b);
			}
		}
	}

}
