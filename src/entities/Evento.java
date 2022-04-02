package entities;
import interfaces.Ievento;

import java.time.Duration;
import java.time.LocalDate;


public abstract class Evento implements Ievento{
	private long id;
	private String nombre;
	private Duration duracionEvento;
	private LocalDate fechaEvento;
	private static long contador=0;
	
	//constructor 
	protected Evento() {
		id=++contador;
	}
	
	//Getters y Setters inicio

	public long getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Duration getDuracionEvento() {
		return duracionEvento;
	}
	public void setDuracionEvento(Duration duracionEvento) {
		this.duracionEvento = duracionEvento;
	}
	public LocalDate getFechaEvento() {
		return fechaEvento;
	}
	public void setFechaEvento(LocalDate fechaEvento) {
		this.fechaEvento = fechaEvento;
	}
	//Getters y Setters fin
	
	//Metodo toString inicio
	@Override
	public String toString() {
		return "id de evento: " + id + ", nombre de evento: " + nombre + ", duracion evento (minutos): " + duracionEvento.toMinutes() + ", fechaEvento:"
				+ fechaEvento;
	}
	//Metodo toString fin
	protected abstract void mostrarEvento();
	
}
