package entities;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.ListasPrecios;

public class EventoRecital extends Evento {
	
	private Banda bandaPrincipal;
	private ArrayList<Banda> bandasSoporte;
	
	//Constructor con parámetro
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
	

}
