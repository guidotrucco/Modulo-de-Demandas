package fiuba;

public class Proyecto {
	private int id;
	private String estado;
	private Estimaciones estimaciones;
	private Producto producto;
	
	public Proyecto(int id, String estado, Estimaciones estimaciones, Producto producto) {
		this.setEstado(estado);
		this.setEstimaciones(estimaciones);
		this.setId(id);
		this.setProducto(producto);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Estimaciones getEstimaciones() {
		return estimaciones;
	}
	public void setEstimaciones(Estimaciones estimaciones) {
		this.estimaciones = estimaciones;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}
