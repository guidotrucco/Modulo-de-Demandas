package fiuba;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class DemandaSteps {
	private Demanda demandaObjetivo;
	private List<Demanda> demandas;
	private List<Demanda> demandasFiltradas;
	
    @Dado("^que hay una lista de demandas con un proyecto \"(.*?)\" version (\\d+)$")
    public void que_hay_una_lista_de_demandas_con_un_proyecto_version(String nombre, int version) throws Throwable {
    	this.demandas = new ArrayList<Demanda>();
    	Demanda demanda1 = new Demanda("razon", 1, "descripcion", "prioridad", "estado", 
    			null, new Producto(nombre,version));
    	Demanda demanda2 = new Demanda("razon", 1, "descripcion", "prioridad", "estado", 
    			null, new Producto("otro nombre",2));
    	Demanda demanda3 = new Demanda("razon", 1, "descripcion", "prioridad", "estado", 
    			null, new Producto("otro nombre",version));
    	demandas.add(demanda1);
    	demandas.add(demanda2);
    	demandas.add(demanda3);
    	demandaObjetivo = demanda1;
    }
    
    @Cuando("^cuando filtro la lista por proyecto con nombre \"(.*?)\" y version (\\d+)$")
    public void cuando_filtro_la_lista_por_proyecto_con_nombre_y_version(String nombre, int version) throws Throwable {
    	FiltroPorProducto filtro = new FiltroPorProducto(nombre,version);
    	this.demandasFiltradas = filtro.filtrar(demandas);
    }
    
    @Entonces("^obtengo una lista de longitud (\\d+) con esa demanda$")
    public void obtengo_una_lista_de_longitud_con_esa_demanda(int len) throws Throwable {
        assertEquals(demandasFiltradas.size(),len);
        assertEquals(demandaObjetivo,demandasFiltradas.get(0));
    }
}
