package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese Cadena de Texto: ");
		String cadena=teclado.nextLine();
		String cadenaInvertida = new StringBuffer().append(cadena).reverse().toString();
		char arreglo[]= cadenaInvertida.toCharArray();
		
		for(int i=0;i<arreglo.length;i++) {
			System.out.println(i+": "+arreglo[i]);
		}
	}

}
