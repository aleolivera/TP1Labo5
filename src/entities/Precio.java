package entities;

import entities.Tipo;

public class Precio {
	private Tipo tipoEvento;
	private Tipo tipoEntrada;
	private double importe;
	
	public Precio() { }

	public Precio(Tipo tipoEvento, Tipo tipoEntrada, double importe) {
		super();
		this.tipoEvento = tipoEvento;
		this.tipoEntrada = tipoEntrada;
		this.importe =importe;
	}

	public Tipo getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(Tipo tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Tipo getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(Tipo tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "Tipo de Evento=" + tipoEvento + ", Tipo de Entrada=" + tipoEntrada + ", importe=" + importe;
	}
}
