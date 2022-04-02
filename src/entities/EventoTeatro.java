package entities;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ListIterator;

import model.ListasPrecios;

public final class EventoTeatro extends Evento {
	private ArrayList<Actor> listaActores;
	private Genero genero;
	
	//Constructor con parámetro
	public EventoTeatro(ArrayList<Actor> listaActores, Genero genero,String nombre, Duration duracionEvento, LocalDate fechaEvento) {
		super();
		super.setNombre(nombre);
		super.setDuracionEvento(duracionEvento);
		super.setFechaEvento(fechaEvento);
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

	@Override
	protected void mostrarEvento() {
		System.out.println("EVENTO TEATRO");
		System.out.println("Fecha del evento: " + getFechaEvento().toString());
		System.out.println(getNombre().toUpperCase());
		System.out.println("Duracion del evento: " + getDuracionEvento().toMinutes() +" min.");
		System.out.println("Genero: " + this.genero.getNombreGenero());
		System.out.println("Actores Principales: ");
		ListIterator<Actor> iterator =this.listaActores.listIterator();
		while(iterator.hasNext()) {
			Actor aux = iterator.next();
			System.out.print(aux.getNombreActor());
			if(iterator.hasNext()) {
				System.out.print(", ");
			}
			else {
				System.out.println(".");
			}
		}
		
	}

}
