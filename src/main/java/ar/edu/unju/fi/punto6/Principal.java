package ar.edu.unju.fi.punto6;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {	
		Scanner ingreso = new Scanner(System.in);
		int[] arreglo= new int[10];
		System.out.println("Ingrese 10 numeros para el nuevo arreglo");
		for(int i=0;i<arreglo.length;i++) {
			System.out.println("ingrese ingrese un numero entero para arreglo["+i+"]");
			arreglo[i] = ingreso.nextInt();
		}
		System.out.println("numeros ingresados correctamente");
		mostrarInversoDelArreglo(arreglo);
	}
	static void mostrarInversoDelArreglo(int [] numeros){
		
	}
}
