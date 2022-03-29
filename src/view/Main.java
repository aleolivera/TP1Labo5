package view;
import model.ListasPrecios;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

import entities.Banda;
import entities.Deporte;
import entities.Entrada;
import entities.EventoDeportivo;
import entities.EventoInfantil;
import entities.EventoRecital;
import entities.Genero;
import entities.Tipo;

public class Main {

	public static void main(String[] args) {
		ListasPrecios lista= new ListasPrecios();
		System.out.println("Lista de Precios");
		System.out.println("Recitales");
		System.out.println("Generales: $"+lista.getImporte(new Tipo(1,"recital"), new Tipo(1,"generales")));
		System.out.println("VIP: $"+lista.getImporte(new Tipo(1,"recital"), new Tipo(2,"vip")));
		System.out.println("Teatro");
		System.out.println("Unica: $"+lista.getImporte(new Tipo(2,"teatro"), new Tipo(1,"fijo")));
		System.out.println("Infantiles");
		System.out.println("Menos de 8 años: $"+lista.getImporte(new Tipo(3,"infantiles"), new Tipo(1,"menor")));
		System.out.println("Menos de 8 años: $"+lista.getImporte(new Tipo(3,"infantiles"), new Tipo(2,"mayor")));
		System.out.println("Deportes");
		System.out.println("Futbol: $"+lista.getImporte(new Tipo(4,"deporte"), new Tipo(1,"futbol")));
		System.out.println("Futbol: $"+lista.getImporte(new Tipo(4,"deporte"), new Tipo(2,"rugby")));
		System.out.println("Futbol: $"+lista.getImporte(new Tipo(4,"deporte"), new Tipo(3,"jockey")));
		
		
		//Clase Duration
		//cargar tiempo usando metodos estaticos como Duration.ofMinutes(long) , o Duration.ofHours(long)
		Duration duracion= Duration.ofMinutes(45);
		System.out.println("El recital dura: "+ duracion.toMinutes() + " minutos");
		
		//Clase LocalDate
		LocalDate fecha= LocalDate.of(2000, 3, 31);
		System.out.println("es el dia: "+ fecha.toString());
		
		//Creacion Evento Infantil
		EventoInfantil eventoInfantil = new EventoInfantil(false,"El sapo Pepe", Duration.ofMinutes(45), LocalDate.of(2022, 5, 20));	
		Entrada entradaInfantil1 = eventoInfantil.crearEntrada(new Tipo(1,"menor"));	
		System.out.println(entradaInfantil1.toString());
		
		//Creacion Evento Deportivo
		EventoDeportivo eventoDeportivo = new EventoDeportivo("Final Copa América", Duration.ofMinutes(90), LocalDate.of(2022, 8, 25), new Deporte("futbol"), true);	
		Entrada entradaDeportiva = eventoDeportivo.crearEntrada(new Tipo(1,"futbol"));	
		System.out.println(entradaDeportiva.toString());
		
		Banda banda = new Banda("mana",new Genero("rock"));
		Banda banda2 = new Banda("soda estereo",new Genero("rock"));
		ArrayList<Banda> bandaSopote=new ArrayList<>();
		bandaSopote.add(banda);
		EventoRecital eventoRecital = new EventoRecital("Cosquín Rock",Duration.ofMinutes(120),LocalDate.of(2022, 10, 10), new Banda("los Beatles",new Genero("rock")),bandaSopote);
		 Entrada entradaRecital = eventoRecital.crearEntrada(new Tipo(1,"generales"));
		 System.out.println(entradaRecital.toString());
	}

}
