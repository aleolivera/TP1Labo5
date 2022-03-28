package entities;
import interfaces.Ievento;

public class Entrada {
	private Ievento evento;
	private Tipo tipoEntrada;
	private double importe;
	private long id;
	
	private static long contador=0; 
	
	//constructor para los eventos en general
	public Entrada(Tipo tipoEntrada, double importe) {
		super();
		this.tipoEntrada = tipoEntrada;
		this.importe = importe;
		
		this.id=++contador;
	}
	
	//constructor vacio
	public Entrada() {
		super();
		this.id=++contador;
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

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Entrada: evento=" + evento.toString() + ", tipo entrada="
				+ tipoEntrada.getNombre() + ", importe=" + importe + ", Id de entrada=" + id;
	}
}
