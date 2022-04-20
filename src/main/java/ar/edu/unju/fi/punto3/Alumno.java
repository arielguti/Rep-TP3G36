package ar.edu.unju.fi.punto3;

public class Alumno {
	
	private String apellido;
	private String nombre;
	private int lu;
	private double notas[] = new double[5];
	
	
	/**
	 * Constructor con parámetros de todos los atributos
	 * @param apellido
	 * @param nombre
	 * @param lu
	 * @param notas arreglo de cinco valores reales
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
	 * @return devuelve el promedio
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
	
	
	@Override
	public String toString() {
		return apellido + ", " + nombre + " - LU: " + lu + " - Promedio: "
				+ calcularPromedio() + " - Nota Máxima: " + obtenerNotaMaxima();
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
