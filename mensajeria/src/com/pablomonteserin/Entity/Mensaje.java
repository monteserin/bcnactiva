package com.pablomonteserin.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mensaje {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
	@OneToOne
private Usuario remitente;
	@OneToOne
private Usuario destinatario;
private String texto;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Usuario getRemitente() {
	return remitente;
}
public void setRemitente(Usuario remitente) {
	this.remitente = remitente;
}
public Usuario getDestinatario() {
	return destinatario;
}
public void setDestinatario(Usuario destinatario) {
	this.destinatario = destinatario;
}
public String getTexto() {
	return texto;
}
public void setTexto(String texto) {
	this.texto = texto;
}



}
