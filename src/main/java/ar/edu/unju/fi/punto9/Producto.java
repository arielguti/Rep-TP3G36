package ar.edu.unju.fi.punto9;

public class Producto {
	
	//parametros de la clase Producto
		private String codigo;
		private String descripcion;
		private float precio;
		private String marca;
		
		
		//constructor Parametrizado de la clase
		public Producto(String codigo, String descripcion, float precio, String marca) {
			super();
			this.codigo = codigo;
			this.descripcion = descripcion;
			this.precio = precio;
			this.marca = marca;
		}
		
		
		//Setters y Getters
		public String getCodigo() {
			return codigo;
		}



		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}



		public String getDescripcion() {
			return descripcion;
		}



		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}



		public float getPrecio() {
			return precio;
		}



		public void setPrecio(float precio) {
			this.precio = precio;
		}



		public String getMarca() {
			return marca;
		}



		public void setMarca(String marca) {
			this.marca = marca;
		}


		//Metodo subir precio 
		public void subirPrecio() {
			precio+=100.25;
		}

		//Metodo ToString
		@Override
		public String toString() {
			return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", marca=" + marca
					+ "]";
		}
		
}
