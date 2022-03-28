package entities;
import interfaces.Ievento;

import java.time.Duration;

public class Entrada {
	private Ievento evento;
	private Tipo tipoEntrada;
	private double importe;
	private long Id;
	
	private static long contador=0; 
	
	//constructor para los eventos en general
	public Entrada(Ievento evento, Tipo tipoEntrada, double importe) {
		super();
		this.evento = evento;
		this.tipoEntrada = tipoEntrada;
		this.importe = importe;
		
		this.Id=++contador;
	}
	
	//constructor vacio
	public Entrada() {
		super();
		this.Id=++contador;
	}

	public Ievento getEvento() {
		return evento;
	}

	public void setEvento(Ievento evento) {
		this.evento = evento;
	}

	public Tipo getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(Tipo tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public static long getContador() {
		return contador;
	}

	public static void setContador(long contador) {
		Entrada.contador = contador;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	public long getId() {
		return Id;
	}

	@Override
	public String toString() {
		return "Entrada [evento=" + evento.toString() + ", tipoEntrada="
				+ tipoEntrada + ", importe=" + importe + ", Id=" + Id + "]";
	}
}
