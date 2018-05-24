package com.pablomonteserin.siniestros;

public class VehiculoSiniestro{

	private Vehiculo vehiculo;
	private int perdida;

	
	
	public VehiculoSiniestro(Vehiculo vehiculo, int perdida) {
		super();
		this.vehiculo = vehiculo;
		this.perdida = perdida;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public int getPerdida() {
		return perdida;
	}
	public void setPerdida(int perdida) {
		this.perdida = perdida;
	}
	
	
}
