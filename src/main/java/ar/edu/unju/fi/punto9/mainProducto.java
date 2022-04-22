package ar.edu.unju.fi.punto9;

import java.util.ArrayList;
import java.util.Scanner;



public class mainProducto {

	public static void main(String[] args) {
		//declaracion e inicializacion de variables, incluida la arrayList de Producto
				ArrayList<Producto> productos = new ArrayList<>();
				float precio=0,suma=0;
				int opc=0;
				String codigo="",descripcion="",marca="";
				Scanner scanner = new Scanner(System.in);
				boolean band=false;
				
				//bucle do while, muestra el menu con las opciones hasta que el usuario lo finalize
				do {	//Menu
						System.out.println("**********************************************");
						System.out.println("1- NUEVO PRODUCTO");
						System.out.println("2- MOSTRAR LOS PRODUCTOS");
						System.out.println("3- INCREMENTAR PRECIO A TODOS LOS PRODUCTOS");
						System.out.println("4- MONTO TOTAL DE TODOS LOS PRODUCTOS");
						System.out.println("5- SALIR");
						System.out.println("ELIJA UNA OPCION");
						System.out.println("**********************************************");
						opc=scanner.nextInt();
						//sentecia switch ; ejecuta las operaciones de acuerdo a las opciones del usario
						switch(opc) {
						//permite crear un objeto (Producto),pidiendo los parametros al usuario para crearlo. Luego lo agrega al arrayList
						case 1: System.out.println("Nuevo Producto");
								System.out.println("Ingrese Codigo del producto");
								codigo=scanner.next();
								System.out.println("Ingrese una descripcion del producto (no usar espacios en blanco)");
								descripcion=scanner.next();
								System.out.println("Ingrese precio del producto");
								precio=scanner.nextFloat();
								System.out.println("ingrese marca del producto");
								marca=scanner.next();
								Producto prod = new Producto(codigo, descripcion, precio, marca);
								System.out.println("Producto creado: "+prod.toString());
								productos.add(prod);
								band=true;
								break;
						//Lista 		
						case 2: if(band==true) { 
								System.out.println("lista: "+productos); System.out.println();
								}else {
									System.out.println("Primero agregue un producto ");
								}
								break;
						//Aumenta el parametro precio de todos los Productos de la lista
						
						case 3: if(band==true) {
									for(int i=0;i<productos.size();i++) 
										productos.get(i).subirPrecio();
										System.out.println("Se ha incrementado el precio de todos los productos,en 100.25");
								}else {
									System.out.println("Primero agregue un producto ");
								}
								break;
								
						//Suma el parametro precio de todos los pruductos de la lista		
						case 4: if(band==true) {
									suma=0;
									for(int i=0;i<productos.size();i++)
										suma+=productos.get(i).getPrecio();
									System.out.println("suma total: "+suma);
								}else {
									System.out.println("Primero agregue un producto ");
								}
								break;
								
						//finaliza el programa
						case 5: System.out.println("FIN DE PROGRAMA");break;
							
						default: System.out.println("Opcion Incorrecta"); break;
					};
				} while (opc!=5);
				

	}

}
