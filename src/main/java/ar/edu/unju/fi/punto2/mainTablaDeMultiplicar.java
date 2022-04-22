package ar.edu.unju.fi.punto2;

import java.util.Arrays;
import java.util.Scanner;

public class mainTablaDeMultiplicar {

	public static void main(String[] args) {
		//declaracion de variables
		int num1;
		String opcion="s";
		//definicion e instanciacion del arreglo
		int[] arreglo= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Scanner scanner= new Scanner(System.in);
		
		
		//bucle while ,mientras la opcion sea "s" no se detiene
		while (opcion.equals("s")) {
			System.out.print("Ingrese un numero del 1 al 9: ");
			num1=scanner.nextInt();
		//filtro de numeros permitidos
			if(num1>=1 && num1<=9) {
				System.out.println("Tabla del "+num1);
		//bucle for: recorre el arreglo imprimiendo las operaciones 
				for(int i: arreglo) 
					System.out.println(num1+" X "+i+" = " +i*num1);
				System.out.println();
		//sentencia para finalizar o continuar con el bucle
				System.out.println("Desea ingresar un numero mas? S/N");
				opcion=scanner.next();
				System.out.println("opc: "+opcion);
				}
			else 
			System.out.println("Debe ingresar un numero del 1 al 9");
			
		}
		System.out.println("fin de programa");

	}

}
