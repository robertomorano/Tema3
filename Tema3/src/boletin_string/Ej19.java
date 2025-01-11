package boletin_string;

public class Ej19 {

	public static void main(String[] args) {
		String frase = "Me gusta merandar grlletas";
		camelcase(frase);
		
	}
	static void camelcase(String texto) {
		String camel = "";
		String letra = "";
		int newEsp = 0;
		texto.toLowerCase();
		int posEsp = texto.indexOf(" ");
		camel += texto.substring(0, posEsp);
		while(posEsp>=0) {
			letra = String.valueOf(texto.charAt(posEsp+1));
			camel += letra.toUpperCase();
			newEsp = texto.indexOf(" ", posEsp+1);
			if(newEsp>=0)
				camel += texto.substring(posEsp+2, newEsp);
			else
				camel += texto.substring(posEsp+2);
			posEsp = newEsp;
		}
		System.out.println(camel);
	}
}
