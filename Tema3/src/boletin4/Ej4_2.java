package boletin4;

public class Ej4_2 {

	public static void main(String[] args) {
		// devuelve true
		int matriz[][] = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };
		boolean simetrica;
		simetrica = esMagica(matriz);
		System.out.println(simetrica);
	}

	static boolean esMagica(int t[][]) {
		boolean simetrica = true;
		int i = 0;
		int j = 0;
		// funcion para ver la suma primera
		int sum = suma(t, 0);
		while (i < t.length && simetrica) {
			// llamamos a la funcion otra vez para comprobar que la siguiente sea igual
			if (sum == suma(t, i)) {
				i++;
			} else {
				simetrica = false;
			}
		}
		return simetrica;
	}

	static int suma(int t[][], int i) {
		int suma = 0;
		for (int j = 0; j < t[i].length; j++) {
			suma += t[i][j];
		}
		return suma;
	}
}
