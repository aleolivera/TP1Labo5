package entities;

import java.time.Duration;
import java.time.LocalDate;

import model.ListasPrecios;

public final class EventoDeportivo extends Evento {
	private Deporte deporte;
	private boolean internacional;
	
	//Constructor con parámetro
	public EventoDeportivo(String nombre, Duration duracionEvento, LocalDate fechaEvento, Deporte deporte, boolean internacional) {
		super();
		super.setNombre(nombre);
		super.setDuracionEvento(duracionEvento);
		super.setFechaEvento(fechaEvento);
		this.deporte = deporte;
		this.internacional = internacional;
	}
	
	//Constructor sin parámetro
	public EventoDeportivo() {
		super();
	}
	
	//Getters y setters
	public Deporte getDeporte() {
		return deporte;
	}


	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}


	public boolean isInternacional() {
		return internacional;
	}


	public void setInternacional(boolean internacional) {
		this.internacional = internacional;
	}

	
	//toString
	@Override
	public String toString() {
		return "deportivo, " + deporte.toString() + ", " + (internacional ? "internacional" : "nacional");
	}

	//Definición de método de la interfaz
	@Override
	public Entrada crearEntrada(Tipo tipoEntrada) {
		ListasPrecios precios = new ListasPrecios();
		double precioEntrada = precios.getImporte(new Tipo(4, "deporte"), tipoEntrada);
		if (internacional) {
			precioEntrada *= 1.3;
		}
		
		Entrada entradaDeportiva = new Entrada(tipoEntrada, precioEntrada);
		entradaDeportiva.setEvento(this);

		return entradaDeportiva;
	}

}
