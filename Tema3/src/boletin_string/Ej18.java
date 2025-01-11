package boletin_string;

public class Ej18 {

	public static void main(String[] args) {
		String titulo="Hola";
		String contenido="Buenas tardes";
		transformar(titulo, contenido);
		
	}
	static void transformar(String titulo, String contenido) {
		String etiquetadoTitulo = "<h1>";
		String etiquetadoContenido = "<p>";
		etiquetadoTitulo += titulo+"<h1>";
		etiquetadoContenido += contenido+"<p>";
		System.out.println(etiquetadoContenido+" "+etiquetadoTitulo);
		
		
	}
}
