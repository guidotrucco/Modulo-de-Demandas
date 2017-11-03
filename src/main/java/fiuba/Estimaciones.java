package fiuba;

import java.util.Date;

public class Estimaciones {
	private Date fechaFinalizacion;
	private int costo;
	private int horasDeTrabajo;
	private int plazoEnMeses;
	private int cantidadDeEmpleados;
	
	public Estimaciones(Date fechaFinalizacion, int costo, int horasDeTrabajo, int plazoEnMeses, 
			int cantidadDeEmpleados) {
		this.setCantidadDeEmpleados(cantidadDeEmpleados);
		this.setCosto(costo);
		this.setFechaFinalizacion(fechaFinalizacion);
		this.setHorasDeTrabajo(horasDeTrabajo);
		this.setPlazoEnMeses(plazoEnMeses);
	}
	

	public Date getFechaFinalizacion() {
		return fechaFinalizacion;
	}

	public void setFechaFinalizacion(Date fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int getHorasDeTrabajo() {
		return horasDeTrabajo;
	}

	public void setHorasDeTrabajo(int horasDeTrabajo) {
		this.horasDeTrabajo = horasDeTrabajo;
	}

	public int getPlazoEnMeses() {
		return plazoEnMeses;
	}

	public void setPlazoEnMeses(int plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}

	public int getCantidadDeEmpleados() {
		return cantidadDeEmpleados;
	}

	public void setCantidadDeEmpleados(int cantidadDeEmpleados) {
		this.cantidadDeEmpleados = cantidadDeEmpleados;
	}
	
}
