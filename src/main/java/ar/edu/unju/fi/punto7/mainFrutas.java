package ar.edu.unju.fi.punto7;

import java.util.ArrayList;
import java.util.Scanner;

public class mainFrutas {

	public static void main(String[] args) {
		//se crea e instancia la arraylist de Strings
				ArrayList<String> frutas = new ArrayList<>();
				//declaracione inicializacion de variables
				Scanner scanner = new Scanner(System.in);
				String fruta="",opc="s";
				int num=0;
				
				//bucle iterativo . guarda strings ingresados por el usuario y finaliza cuando este lo decida  
				while(opc.equals("s")) {
					System.out.print("Ingrese el nombre de una fruta: ");
					fruta=scanner.next();
					frutas.add(fruta);
					System.out.print("Desea Ingresar mas frutas? S/N (minusculas): ");
					opc=scanner.next(); 
				}
				
				//se imprimen los strings con indice impar de la arraylist
				System.out.println("frutas con indice par en la lista");
				for(int i=0;i<frutas.size();i++) {
					if(i%2==0) 
						System.out.print(frutas.get(i)+" ");		
				}
				System.out.println();
				//se borra un string de acuerdo al indice que ingrese el usuario , tambien se muestra la lista completa
				System.out.println("Ingrese un numero entero positivo entre 0 y "+(frutas.size()-1));
				num=scanner.nextInt();
				if(num>=0 && num<frutas.size()) {
					System.out.println("se elimino la fruta "+frutas.get(num));
					frutas.remove(num);
					System.out.print("lista de frutas: "+frutas);
					System.out.println();
				}else {
					System.out.println("Ingrese un numero dentro del rango 0 y "+frutas.size());
				}
				
				System.out.println("FIN DE PROGRAMA");

	}

}
