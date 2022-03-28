package entities;

import java.time.Duration;
import java.time.LocalDate;

import model.ListasPrecios;

public final class EventoInfantil extends Evento{
	private boolean tieneSouvenir;
	
	// Constructores inicio
	public EventoInfantil() {
		super();
	}
	
	public EventoInfantil(boolean tieneSouvenir, String nombre, Duration duracionEvento, LocalDate fechaEvento) {
		super();
		super.setNombre(nombre);
		super.setDuracionEvento(duracionEvento);
		super.setFechaEvento(fechaEvento);
		this.tieneSouvenir = tieneSouvenir;
	}
	// Constructores fin
	
	
	// Getters y setters inicio
	public boolean isTieneSouvenir() {
		return tieneSouvenir;
	}

	public void setTieneSouvenir(boolean tieneSouvenir) {
		this.tieneSouvenir = tieneSouvenir;
	}
	// Getters y setters fin

	@Override
	public Entrada crearEntrada(Tipo tipoEntrada) {

		//Consigo el precio del evento según su tipo de entrada y tipo de evento
		ListasPrecios listaPrecios = new ListasPrecios();
		double importeEntrada =	listaPrecios.getImporte(new Tipo(3,"infantil"),tipoEntrada);
		
		//Creamos entrada
		Entrada entrada = new Entrada(tipoEntrada, importeEntrada);
		
		//referimos la entrada al evento actual que la crea
		entrada.setEvento(this);
		
		return entrada;
	}
	
	// Metodo toString inicio
	@Override
	public String toString() {
		return "infantil, tieneSouvenir=" + (tieneSouvenir ? " si" : " no") + " , "+ super.toString();
	}
	// Metodo toString fin
	
}
