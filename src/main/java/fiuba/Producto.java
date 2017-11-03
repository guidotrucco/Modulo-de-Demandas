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
	
	@Override
	public boolean equals(Object other){
	    if (other == null) return false;
	    if (other == this) return true;
	    if (!(other instanceof Producto))return false;
	    Producto otro = (Producto)other;
	    if((otro.getNombre() == this.getNombre()) & (otro.getVersion() == this.getVersion())) return true;
	    return false;
	}
}
