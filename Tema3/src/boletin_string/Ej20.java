package boletin_string;

import java.util.Arrays;
import java.util.Scanner;

public class Ej20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= 0;
		String cadena = "destornillador";
		String secuencia[];
		System.out.println("Introduce el numero");
		n = sc.nextInt();
		secuencia = secuenciar(n, cadena);
		System.out.println(Arrays.deepToString(secuencia));
	}
	static String[] secuenciar(int n, String cadena) {
		 String secuencia[];
		 char[] letras;
		 String cad1 = "";
		 int x=0;
		 cadena.replace(" ","");
		 secuencia =new String[(cadena.length()/n)+1];
		 letras = cadena.toCharArray();
		 for(int j=0; j<secuencia.length;j++) { 
			 secuencia[j]="";
			 for(int i=x; i<n+x&&i<letras.length;i++) {
				 secuencia[j] += String.valueOf(letras[i]);
			 }
			 x+=n;
			 System.out.println(secuencia[j]);
		 }
		 return secuencia;
	}
}
