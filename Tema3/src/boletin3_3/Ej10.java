package boletin3_3;

import java.util.HashMap;
import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Double> diccionario= new HashMap<>();
		int num =0;
		int cont = 0;
		String clave = "";
		double valor = 0;
		do {
		num=0;
		System.out.println("1 .Alta.\r\n"
				+ "2 .Baja.\r\n"+"3 .listar existencias \n"
				+ "0 .Salir. Termina el programa.");
		num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("Nombre:");
			 clave=sc.next();
			 System.out.println("Precio: ");
			 valor = sc.nextInt();
			 diccionario.put(clave, valor);
			 System.out.println("Añadido con exito");
			break;
		case 2:
			System.out.println("Producto a eliminar:");
			clave = sc.next();
			if (diccionario.containsKey(clave)) {
				diccionario.remove(clave);
				System.out.println("Eliminado con exito");
			}
			break;
		case 3:
			//mejorar
			System.out.println(diccionario);
			break;
		default:
			break;
		}
	
		
		}while(num!=0);

	}

}
