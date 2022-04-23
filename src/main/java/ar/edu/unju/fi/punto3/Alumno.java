package ar.edu.unju.fi.punto3;

/**
 * Clase del objeto Alumno que contiene datos personales y sus notas
 * @author Mamaní
 */
public class Alumno {
	
	private String apellido;
	private String nombre;
	private int lu;
	private double notas[];
	
	
	/**
	 * Constructor que inicializa a un objeto Alumno con todos sus atributos
	 * @param apellido Apellido del alumno
	 * @param nombre Nombre del alumno
	 * @param lu Número entero de Libreta Universitaria del alumno
	 * @param notas Arreglo donde están las notas del alumno
	 */
	public Alumno(String apellido, String nombre, int lu, double[] notas) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.lu = lu;
		this.notas = notas;
	}
	
	
	/**
	 * Función que calcula el promedio de las notas del alumno
	 * @return Devuelve el promedio de las notas
	 */
	public double calcularPromedio() {
		double total = 0;
		for(double nota: this.notas)
			total += nota;
		return total/5;
	}
	
	/**
	 * Función que obtiene la máxima nota del alumno
	 * @return obtiene la nota
	 */
	public double obtenerNotaMaxima() {
		double maxima = this.notas[0];
		for(int i=1; i<5; i++) {
			if(this.notas[i] > maxima)
				maxima = this.notas[i];
		}
		return maxima;
	}
	
	
	/**
	 * Función que devuelve una cadena con todos los datos del alumno
	 */
	@Override
	public String toString() {
		return "LU " + lu + "\t- " + apellido.toUpperCase() + ", " + nombre + "\t- Promedio: "
				+ calcularPromedio() + " - Nota Máxima: " + obtenerNotaMaxima() + " - [" + notas[0] + 
				", " + notas[1] + ", " + notas[2] + ", " + notas[3] + ", " + notas[4] + "]";
	}


	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getLu() {
		return lu;
	}
	
	public void setLu(int lu) {
		this.lu = lu;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public void setNotas(double[] notas) {
		this.notas = notas;
	}

}
