package ar.edu.unju.fi.ejercicio8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio3.Alumno;

/**
 * Clase que permite manipular objetos de tipo Alumno (ABM de objetos Alumno)
 * @author Mamaní
 * @version 1.0
 */
public class Principal {

	/**
	 * atributo estático que indica un objeto de tipo Alumno
	 */
	static Alumno alumno;
	/**
	 * atributo estático que aloja la lista de Objetos de tipo Alumno
	 */
	static List<Alumno> alumnos = new ArrayList<Alumno>();
	
	static Scanner introNumber = new Scanner(System.in);//ingreso de nro. desde consola
	
	/**
	 * Método del principal donde se inicializa el programa
	 * @param args
	 */
	public static void main(String[] args) {
		int opcion = 0;
		boolean distinto = false;
		do {
        	verMenu();
            try {            	
                opcion = introNumber.nextInt();
                ejecutarOpcion(opcion);
                if(opcion<1 || opcion>6) System.out.println("Ingrese entre 1 y 6.");
            } catch (InputMismatchException e) {
                System.out.println("Debes teclear un número entero.");
                introNumber = new Scanner(System.in);
                distinto = true;
            }
            if (opcion == (int) opcion) { //comprueba buffer que tiene un entero, para cambiar check a false
                distinto = false;
            }
        } while (opcion < 1 || opcion > 6 || !distinto);
	}
	
	/**
	 * Procedimiento que muestra el menú de opciones
	 */
	public static void verMenu() {
		System.out.println("\n   MENÚ REGISTRO DE ALUMNOS");
		System.out.println("1. Nuevo alumno");
		System.out.println("2. Eliminar alumno");
		System.out.println("3. Modificar notas alumno");
		System.out.println("4. Mostrar todos los alumnos");
		System.out.println("5. Mostrar los que superan el promedio 6");
		System.out.println("6. Salir");
		System.out.print("   Opción: ");		
	}
	
	/**
	 * Procedimiento que ejecuta la opción del menú realizada
	 * @param opcion nro de opción del menú que se realizará
	 */
	public static void ejecutarOpcion(int opcion) {
		Alumno alu;		
		switch(opcion) {
			case 1: alu = registrar();
					if(alu!=null)
						agregarAlumno(alu);						
					else
						System.out.println("Alumno no se carga. El LU ya existe."); break;
			case 2: if(alumnos.isEmpty()==false) {						
						System.out.print("Nro LU a eliminar: ");
						int lu = introNumber.nextInt();
						if(encontrarLU(lu)==true)
							borrarAlumno(lu);
						else
							System.out.println("No existe ese nro de LU.") ;
					}else
						System.out.println("No hay alumnos registrados."); break;
			case 3: if(!alumnos.isEmpty()) {
						System.out.print("Nro LU a modificar: ");
						int nro = introNumber.nextInt();
						if(encontrarLU(nro))
							editarNotas(nro);
						else
							System.out.println("No existe ese nro de LU.");
					}else
						System.out.println("No hay alumnos registrados.") ;break;
			case 4: if(!alumnos.isEmpty())
						mostrarAlumnos();
					else
						System.out.println("Sin alumnos"); break;
			case 5: if(!alumnos.isEmpty())
						mostrarMejores();
					else
						System.out.println("Sin alumnos"); break;
			case 6: System.out.println("Fin del programa"); break;			
		}
	}
	
	/**
	 * Función que registra datos del alumno y crea el objeto Alumno
	 * @return Devuelve un objeto tipo Alumno
	 */
	public static Alumno registrar() {
		Scanner introTexto = new Scanner(System.in);
		double lasNotas[]= new double[5];
		System.out.println("REGISTRO DE ALUMNOS");
		System.out.print("Apellido(s): ");
		String apellidos = introTexto.nextLine();		
		System.out.print("Nombre(s): ");
		String nombres = introTexto.nextLine();
		System.out.print("Nro. LU: ");
		int nroLu = introNumber.nextInt();
		if(!encontrarLU(nroLu)) {
			for(int i=0; i<5; i++) {
				System.out.print("Nota " + (i+1) + ": ");
				lasNotas[i] = introNumber.nextDouble();
				while(lasNotas[i]<1 || lasNotas[i]>10) {
					System.out.print("Error. Ingrese entre 1 y 10: ");
					lasNotas[i] = introNumber.nextDouble();
				}
			}
			 return alumno = new Alumno(apellidos, nombres, nroLu, lasNotas);
		}else
			 return null;
	}
			
	/**
	 * Procedimiento que agrega un objeto Alumno a la lista
	 * @param unAlumno Objeto que será agregado
	 */
	public static void agregarAlumno(Alumno unAlumno) {
		Alumno alu = unAlumno;		
		alumnos.add(alu);
		System.out.println("Alumno agregado");
	}
	
	/**
	 * Función que busca e indica si existe el objeto alumno según LU
	 * @param lu Nro de LU del alumno a buscar
	 * @return Indica verdadero si encontró al alumno con el LU
	 */
	public static boolean encontrarLU(int lu) {
		Iterator<Alumno> iteratorAlumnos = alumnos.iterator();
		boolean existe = false;
		while(iteratorAlumnos.hasNext() && !existe) {
			Alumno unAlumno = iteratorAlumnos.next();
			if(unAlumno.getLu()==lu)				
				existe = true;
		}
		return existe;
	}
	
	/**
	 * Procedimiento que elimina a un objeto Alumno
	 * @param nroLU nro de LU del alumno a eliminar
	 */
	public static void borrarAlumno(int nroLU) {
		Iterator<Alumno> iteratorAlumnos = alumnos.iterator();
		while(iteratorAlumnos.hasNext()) {
			Alumno unAlumno = iteratorAlumnos.next();
			if(unAlumno.getLu()==nroLU)
				iteratorAlumnos.remove();
		}
	}
	
	/**
	 * Procedimiento que permite modificar las notas del alumno
	 * @param nroLU nro. de LU del alumno a modificar
	 */
	public static void editarNotas(int nroLU) {
		Iterator<Alumno> iteratorAlumnos = alumnos.iterator();
		double notasNuevas[] = new double[5];
		while(iteratorAlumnos.hasNext()) {
			Alumno unAlumno = iteratorAlumnos.next();
			if(unAlumno.getLu()==nroLU)	{
				System.out.println(unAlumno);				
				for(int i=0;i<5;i++) {
					System.out.print("Nota " + (i+1) + ": ");
					notasNuevas[i] = introNumber.nextDouble();
					while(notasNuevas[i]<1 || notasNuevas[i]>10) {
						System.out.print("Error. Ingrese entre 1 y 10: ");
						notasNuevas[i] = introNumber.nextDouble();
					}
				}
				unAlumno.setNotas(notasNuevas);
			}
		}		
	}
	
	/**
	 * Procedimiento que muestra a todos los alumnos
	 */
	public static void mostrarAlumnos() {
		System.out.println("\t\tLista de alumnos");
		for(Alumno a: alumnos) {
			System.out.println(a);			
		}
	}
	
	/**
	 * Procedimiento que muestra a los alumnos cuyo promedio de notas es superior o igual a 6
	 */
	public static void mostrarMejores() {
		System.out.println("Lista de promedios mayor a 6");
		for(Alumno alu: alumnos) {
			if(alu.calcularPromedio()>=6) {
				System.out.println(alu);
			}
		}
	}

}
