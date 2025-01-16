package boletin_string;

import java.util.Arrays;
import java.util.Scanner;

public class ExArrStr {
	static char abcedario[][] = { { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' },
			{ 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q' }, { 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' } };
	static String frases[] = {
			"las guerras seguiran mientras el color de la piel siga siendo mas importante que el de los ojos",
			"aprende a vivir y sabras morir bien", "cada dia sabemos mas y entendemos menos",
			"el dinero no puede comprar la vida", "la verdadera sabiduria esta en reconocer la propia ignorancia" };
	static String fraseReal;
	static String fraseCodificada;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String codigo = "";
		char letra;
		desordenaAbecedario();
		System.out.println(Arrays.deepToString(abcedario));
		eligeFrase();
		System.out.println(fraseReal);
		codificaFrase();
		System.out.println(fraseCodificada);
		while (!sonIguales()) {
			System.out.println("Dame el codifo");
			codigo=sc.next();
			System.out.println("Dame la letra");
			letra= sc.next().charAt(0);
			if(compruebaCodigo(letra, codigo)) {
				System.out.println(fraseCodificada);
			}
		}
		System.out.println("Has terminado");
	}

	static void desordenaAbecedario() {
		// Variables de cordenada para intercambiar valores y que o se pierda ningun
		// valor
		int x = 0;
		int y = 0;
		// Variable de intercambio
		char valor;
		// recorrer todo el array asignadole el valor de posiciones aleatorias
		for (int i = 0; i < abcedario.length; i++) {
			for (int j = 0; j < abcedario[i].length; j++) {
				y = (int) (Math.random() * 9);
				x = (int) (Math.random() * 3);
				valor = abcedario[i][j];
				abcedario[i][j] = abcedario[x][y];
				abcedario[x][y] = valor;
			}
		}
	}

	static void eligeFrase() {
		fraseReal = frases[(int) (Math.random() * 4)];
	}

	static void codificaFrase() {
		fraseCodificada = "";
		for (int k = 0; k < fraseReal.length(); k++) {
			for (int i = 0; i < abcedario.length; i++) {
				for (int j = 0; j < abcedario[i].length; j++) {
					if (fraseReal.charAt(k) == abcedario[i][j]) {
						fraseCodificada += i + "" + j + " ";
					}
				}
			}
		}
	}

	static boolean compruebaCodigo(char letra, String codigo) {
		boolean es = false;
		// Array para guardar los valores para el abecedario
		char[] letras = codigo.toCharArray();
		
		if (abcedario[letras[0]-'0'][letras[1]-'0'] == letra) {
			es = true;
			fraseCodificada = fraseCodificada.replace(codigo, String.valueOf(letra));
		}
		return es;

	}

	static boolean sonIguales() {
		boolean terminado = false;
		if (fraseReal.equals(fraseCodificada.replace(" ", ""))) {
			terminado = true;
		}
		return terminado;
	}
}