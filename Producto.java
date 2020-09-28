public class Producto {
	private String nombre;
	private float valor;

	private int codigoProducto;
	
	
	public Producto(String nombre) {
		this.nombre = nombre;
		this.valor = 0;

		this.codigoProducto = 10;
		
	}
	
	public Producto(String nombre, int valor) {
		this.nombre = nombre;
		if (valor > 0){
			this.valor = valor;
		}else{
			this.valor = 0;
		}
	}
	
	public String getNombre() {	
		return this.nombre;
	}
	
	public float getValor() {	
		return this.valor;
	}
	
	public void setValor(float valor) {
		if (valor > 0){
			this.valor = valor;
		}else {
			this.valor = 0;
		}
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public boolean equals(Object producto) {
		return this.hashCode() == producto.hashCode();
	}
	public int hashCode() {
		return this.nombre.hashCode();
	}
	

}