package entities;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import model.ListasPrecios;

public class EventoRecital extends Evento {
	
	private Banda bandaPrincipal;
	private ArrayList<Banda> bandasSoporte;
	
	public EventoRecital(String nombre, Duration duracionEvento, LocalDate fechaEvento, Banda bandaPrincipal,ArrayList<Banda> bandasSoporte)
	{
		super();
		super.setNombre(nombre);
		super.setDuracionEvento(duracionEvento);
		super.setFechaEvento(fechaEvento);
		this.bandaPrincipal = bandaPrincipal;
		this.bandasSoporte = bandasSoporte;

	}
	
	public EventoRecital() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "Recital , bandaPrincipal=" + bandaPrincipal.getNombre() +", bandas Soporte" + bandasSoporte.toString()+  "";
	}

	public Banda getBandaPrincipal() {
		return bandaPrincipal;
	}

	public void setBandaPrincipal(Banda bandaPrincipal) {
		this.bandaPrincipal = bandaPrincipal;
	}

	public List<Banda> getBandasSoporte() {
		return bandasSoporte;
	}

	public void setBandasSoporte(ArrayList<Banda> bandasSoporte) {
		this.bandasSoporte = bandasSoporte;
	}

	@Override
	public Entrada crearEntrada(Tipo tipoEntrada) {
		      
		 ListasPrecios listaPrecios =new ListasPrecios();
		 double precioEntrada = listaPrecios.getImporte(new Tipo(1, "recital"), tipoEntrada);
			//Crear entrada
			Entrada entrada = new Entrada(tipoEntrada, precioEntrada);
			entrada.setEvento(this);

		return entrada;
	}

	@Override
	protected void mostrarEvento() {
		System.out.println("EVENTO RECITAL");
		System.out.println("Fecha del evento: " + getFechaEvento().toString());
		System.out.println(getNombre().toUpperCase());
		System.out.println("Duracion del evento: " + getDuracionEvento().toMinutes() +" min.");
		System.out.println("Banda principal: " + this.bandaPrincipal.getNombre());
		System.out.println("Bandas soporte: ");
		ListIterator<Banda> iterator = bandasSoporte.listIterator();
		while(iterator.hasNext()) {
			Banda aux = iterator.next();
			System.out.print(aux.getNombre());
			if(iterator.hasNext()) {
				System.out.print(", ");
			}
			else {
				System.out.println(".");
			}
		}
	}
}
