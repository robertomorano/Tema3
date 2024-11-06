package boletin1;

public class Ej1 {

	public static void main(String[] args) {
		// inicializacion del array
		int numeros[]=new int [10];
		
		for (int i=0;i<numeros.length;i++) {
			numeros[i]=(int) (Math.random()*100+1);
			System.out.println(numeros[i]);
		}
	}

}
