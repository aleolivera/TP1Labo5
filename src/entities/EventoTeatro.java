package entities;
import java.util.ArrayList;

import model.ListasPrecios;

public final class EventoTeatro extends Evento {
	private ArrayList<Actor> listaActores;
	private Genero genero;
	
	//Constructor con parámetro
	public EventoTeatro(ArrayList<Actor> listaActores, Genero genero) {
		super();
		this.genero= genero;
		this.listaActores = listaActores;
	}
	
	//Constructor sin parámetro
	public EventoTeatro() {
		super();
	}
	

	@Override
	public String toString() {
		return "Evento Teatro, Actores = " + listaActores + ", genero=" + genero + "]";
	}

	public ArrayList<Actor> getListActor() {
		return listaActores;
	}

	public void setListActor(ArrayList<Actor> listaActores) {
		this.listaActores = listaActores;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public Entrada crearEntrada(Tipo tipoEntrada) {
		
		//Consigo el precio del evento según su tipo de entrada y tipo de evento
		ListasPrecios listaPrecios = new ListasPrecios();
		double importeEntrada =	listaPrecios.getImporte(new Tipo(3,"teatro"),tipoEntrada);
		
		//Creamos entrada
		Entrada entrada = new Entrada(tipoEntrada, importeEntrada);
		
		//referimos la entrada al evento actual que la crea
		entrada.setEvento(this);
		
		return entrada;
	}

}
