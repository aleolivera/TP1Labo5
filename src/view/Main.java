package view;
import model.ListasPrecios;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import entities.Actor;
import entities.Deporte;
import entities.Entrada;
import entities.EventoDeportivo;
import entities.EventoInfantil;
import entities.EventoTeatro;
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
		
		//Clase Evento Teatro
		ArrayList<Actor> actores = new ArrayList<Actor>();
		Actor actor = new Actor();
		actores.add(new Actor(1, "Julio Chavez"));
		actores.add(new Actor(2, "Leticia Bredicce"));
		actores.add(new Actor(3, "Ricardo Darin"));
		
		boolean validationActor = actor.ValidationArrayList(actores);
		if(validationActor == false)
		{
			System.out.println("La cantidad de actores no debe ser mayor a tres");
		}
		else
		{
			EventoTeatro eventoTeatro = new EventoTeatro(actores, new Genero ("Dramaturgo"));
			Entrada entradaTeatro = eventoTeatro.crearEntrada(new Tipo(1, "Teatro" ));
			System.out.println(entradaTeatro.toString());
		}

	}
	

}
