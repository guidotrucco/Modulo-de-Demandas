package fiuba;

import java.util.ArrayList;
import java.util.List;

public class FiltroPorProducto implements FiltroDemandas {
	private Producto producto;
	public FiltroPorProducto(String nombre, int version) {
		this.producto = new Producto(nombre,version);
	}

	@Override
	public List<Demanda> filtrar(List<Demanda> demandas) {
		List<Demanda> demandasFiltradas = new ArrayList<Demanda>(); 
	      
	    for (Demanda demanda : demandas) {
	    	if(demanda.getProducto().equals(this.getProducto())){
	    		demandasFiltradas.add(demanda);
	    	}
	    }
	    return demandasFiltradas;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
