package fiuba;

public class Producto {
	private String nombre;
	private int version;
	
	public Producto(String nombre, int version) {
		this.setNombre(nombre);
		this.setVersion(version);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
}
