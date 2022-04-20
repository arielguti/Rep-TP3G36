package ar.edu.unju.fi.punto3;

import java.util.Scanner;

public class Principal {

	private static Scanner ingreso = new Scanner(System.in);
	private static Alumno alumno;
	
	
	public static void main(String[] args) {		
		char respuesta;		
		do{
			registrar();
			System.out.println("Promedio: " + alumno.calcularPromedio());
			System.out.println("Nota máxima: " + alumno.obtenerNotaMaxima());
			
			System.out.print("Continúa cargando? (S/N): ");
			respuesta = ingreso.next().charAt(0);
		}while(respuesta =='S' || respuesta =='s');		
	}
	
	
	static void registrar(){
		double lasNotas[] = new double[5];
		
		System.out.println("DATOS DE ALUMNO");
		System.out.print("Apellido(s): ");
		String apellido = ingreso.next();
		System.out.print("Nombre(s): ");
		String nombre = ingreso.next();
		System.out.print("LU: ");
		int nroLu = ingreso.nextInt();
		for(int i=0; i<5; i++){
			do{
				System.out.print("Nota " + (i+1) + ": ");
				lasNotas[i] = ingreso.nextDouble();
				if(lasNotas[i]<1 || lasNotas[i]>10) System.out.println("Error. Nota entre 1 y 10");
			}while(lasNotas[i]<1 || lasNotas[i]>10);			
		}
		alumno = new Alumno(apellido, nombre, nroLu, lasNotas);
	}

}
