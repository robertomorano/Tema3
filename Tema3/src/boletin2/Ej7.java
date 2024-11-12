package boletin2;

import java.util.Arrays;

public class Ej7 {

	public static void main(String[] args) {
		int numeros[]= new int[55];
		int cont=1;
		int x=0;
		while(cont<=10) {
			Arrays.fill(numeros, x,cont+x,cont);
			x+=cont;
			cont++;
		}
		System.out.println(Arrays.toString(numeros));
	}

}
