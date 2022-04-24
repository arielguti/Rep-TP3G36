package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int arreglo[] = new int[8]; 
		int numero;
		for(int i=0; i<arreglo.length;i++) {
			System.out.println("Ingrese numero entero: ");
			numero=teclado.nextInt();
			arreglo[i]=numero;
		}
		
		for(int j=0;j<arreglo.length;j++) {
			if(arreglo[j]%2==0) {
				System.out.println(j+": "+arreglo[j]+" es Par");
			}else {
				System.out.println(j+": "+arreglo[j]+" es Impar");
			}
			
		}
	}

}
