package fiuba;

public class Demanda {
	private String razon;
	private int id;
	private String descripcion;
	private String prioridad;
	private String estado;
	private Estimaciones estimaciones;
	private Producto producto;
	
	public Demanda(String razon, int id, String descripcion, String prioridad, String estado, 
			Estimaciones estimaciones, Producto producto) {
		this.setDescripcion(descripcion);
		this.setEstado(estado);
		this.setEstimaciones(estimaciones);
		this.setId(id);
		this.setPrioridad(prioridad);
		this.setRazon(razon);
		this.setProducto(producto);
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRazon() {
		return razon;
	}
	public void setRazon(String razon) {
		this.razon = razon;
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
