package com.pablomonteserin;

import com.opensymphony.xwork2.ActionSupport;
import com.pablomonteserin.util.ReservaUtil;

public class ReservaAction extends ActionSupport {
	private Reserva reserva;
	ReservaValores reservaValores;

	public String salvarReserva() {
		ReservaBO reservaBO = new ReservaBO();
		reservaBO.salvarReserva(reserva);
		reservaValores = ReservaUtil.getReservaValues(reserva);
		return SUCCESS;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public ReservaValores getReservaValores() {
		return reservaValores;
	}

	public void setReservaValores(ReservaValores reservaValores) {
		this.reservaValores = reservaValores;
	}

}
