package ar.edu.unju.fi.punto1;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {	
		Scanner ingreso = new Scanner(System.in);
		int[] arreglo1= {1,2,3,4,5};
		int[] arreglo2= {5,4,3,2,1};
		for(int i=0;i<arreglo1.length;i++) {
			System.out.println("ingrese un numero entero para el primer arreglo");
			arreglo1[i] = ingreso.nextInt();
		}
		for(int i=0;i<arreglo2.length;i++) {
			System.out.println("ingrese un numero entero para el segungo arreglo");
			arreglo2[i] = ingreso.nextInt();
		}
		
		mostrarDivision(arreglo1,arreglo2);
	}
	
	static void mostrarDivision( int [] numeros1,int [] numeros2) {
		for(int i=0;i<numeros1.length;i++) {
			if(numeros2[i]!=0) {
			System.out.println(numeros1[i] + "/"+numeros2[i]+"="+(float)numeros1[i]/numeros2[i]);}
		
			else {
				System.out.println(numeros1[i] + "/"+numeros2[i]+"=ERROR imposible dividir por 0");
			}
			
				}
	}
	
}
