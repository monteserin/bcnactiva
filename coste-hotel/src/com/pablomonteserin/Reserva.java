package com.pablomonteserin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reserva {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String destino;
private int noches;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDestino() {
	return destino;
}
public void setDestino(String destino) {
	this.destino = destino;
}
public int getNoches() {
	return noches;
}
public void setNoches(int noches) {
	this.noches = noches;
}



}
