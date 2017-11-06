package fiuba;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DemandaSteps {
	private Demanda demanda;
	private List<Demanda> demandas;
	private List<Demanda> demandasFiltradas;
	private Proyecto proyecto;
	
	@Dado("^que hay una lista de demandas con un producto \"(.*?)\" version (\\d+)$")
	public void que_hay_una_lista_de_demandas_con_un_producto_version(String nombre, int version) throws Throwable {
		this.demandas = new ArrayList<Demanda>();
    	Demanda demanda1 = new Demanda("razon", 1, "descripcion", "prioridad", "pendiente", 
    			null, new Producto(nombre,version));
    	Demanda demanda2 = new Demanda("razon", 1, "descripcion", "prioridad", "pendiente", 
    			null, new Producto("otro nombre",2));
    	Demanda demanda3 = new Demanda("razon", 1, "descripcion", "prioridad", "pendiente", 
    			null, new Producto("otro nombre",version));
    	demandas.add(demanda1);
    	demandas.add(demanda2);
    	demandas.add(demanda3);
    	demanda = demanda1;	    
	}
    
	@Cuando("^filtro la lista por producto con nombre \"(.*?)\" y version (\\d+)$")
	public void cuando_filtro_la_lista_por_producto_con_nombre_y_version(String nombre, int version) throws Throwable {
		FiltroPorProducto filtro = new FiltroPorProducto(nombre,version);
    	this.demandasFiltradas = filtro.filtrar(demandas);
	}
    
    @Entonces("^obtengo una lista de longitud (\\d+) con esa demanda$")
    public void obtengo_una_lista_de_longitud_con_esa_demanda(int len) throws Throwable {
        assertEquals(demandasFiltradas.size(),len);
        assertEquals(demanda,demandasFiltradas.get(0));
    }
    
    @Dado("^que hay una demanda$")
    public void que_hay_una_demanda() throws Throwable {
        this.demanda = new Demanda("razon", 0, "descripcion", "prioridad", "pendiente", new Estimaciones(new Date(), 100000, 500, 3, 4), new Producto("ERP",1));
    }
    
    @Cuando("^cuando inicio un proyecto a partir de esta$")
    public void cuando_inicio_un_proyecto_a_partir_de_esta() throws Throwable {
        this.proyecto = this.demanda.iniciarProyecto();
    }
    
    @Entonces("^el proyecto mantiene las mismas estimaciones y producto que la demanda$")
    public void el_proyecto_mantiene_las_mismas_estimaciones_y_producto_que_la_demanda() throws Throwable {
    	assertEquals(this.demanda.getEstimaciones(),this.proyecto.getEstimaciones());
    	assertEquals(this.demanda.getProducto(),this.proyecto.getProducto());
    }
    
}
