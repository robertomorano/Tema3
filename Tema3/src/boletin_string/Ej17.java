package boletin_string;

public class Ej17 {

	public static void main(String[] args) {
		//Codigo original
		String codigo=" if (a==3) /* igual a tres */ a++; /* incrementamos a */";
		String codigofinal = "";
		final String INICIO = "/*";
		final String FINAL = "*/";
		codigofinal += codigo.substring(0,codigo.indexOf(INICIO));
		codigofinal += codigo.substring(codigo.indexOf(FINAL));
		
		while (codigofinal.contains(FINAL)&&codigofinal.contains(INICIO)) {
			codigofinal += codigofinal.substring(0,codigofinal.indexOf(INICIO));
			codigofinal += codigofinal.substring(codigofinal.indexOf(FINAL));
		}
		System.out.println(codigofinal);
	}

}
