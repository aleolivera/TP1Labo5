package view;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ListIterator;

import entities.Actor;
import entities.Banda;
import entities.Deporte;
import entities.Entrada;
import entities.EventoDeportivo;
import entities.EventoInfantil;
import entities.EventoTeatro;
import entities.EventoRecital;
import entities.Genero;
import entities.Tipo;

public class Main {

	public static void main(String[] args) {
		              //Evento Infantil
		ArrayList<Entrada> entradas= new ArrayList<Entrada>();
		
		// Entrada para menor de 8  años
		EventoInfantil eventoInfantil = new EventoInfantil(false,"El sapo Pepe", Duration.ofMinutes(45), LocalDate.of(2022, 5, 20));	
		Entrada entradaInfantil1 = eventoInfantil.crearEntrada(new Tipo(1,"menor"));
		entradas.add(entradaInfantil1);
		
		// Entrada para mayores de 8  años
		EventoInfantil eventoInfantil2 = new EventoInfantil(false,"el hombre araña", Duration.ofMinutes(50), LocalDate.of(2022, 6, 20));	
		Entrada entradaInfantil2 = eventoInfantil2.crearEntrada(new Tipo(2,"mayor"));
		eventoInfantil2.setTieneSouvenir(true);
		entradas.add(entradaInfantil2);
		
		              //Evento Deportivo
		EventoDeportivo eventoDeportivo = new EventoDeportivo("Final Copa América", Duration.ofMinutes(90), LocalDate.of(2022, 8, 25), new Deporte("futbol"), true);	
		Entrada entradaDeportiva = eventoDeportivo.crearEntrada(new Tipo(1,"futbol"));	
		entradas.add(entradaDeportiva);
		
		EventoDeportivo eventoDeportivo2 = new EventoDeportivo("Campeonato argentino", Duration.ofMinutes(80), LocalDate.of(2022, 12, 15), new Deporte("Rugby"), true);	
		Entrada entradaDeportiva2 = eventoDeportivo2.crearEntrada(new Tipo(2,"Rugby"));	
		eventoDeportivo2.setInternacional(false);  
		entradas.add(entradaDeportiva2);
		
		                 //Evento Teatro
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
			EventoTeatro eventoTeatro = new EventoTeatro(actores, new Genero ("Dramaturgo"),"Fausto", Duration.ofMinutes(50), LocalDate.of(2022, 4, 6));
			Entrada entradaTeatro = eventoTeatro.crearEntrada(new Tipo(1, "Teatro" ));
			entradas.add(entradaTeatro);
		}
		     
		             // creando entrada teatro  de genero  comedia
		ArrayList<Actor> actores2 = new ArrayList<Actor>();
		Actor actor2 = new Actor();
		actores2.add(new Actor(1, "Martin Garcia"));
		actores2.add(new Actor(2, "Leandro Perez"));
		actores2.add(new Actor(3, "Maria Peña"));
		
		if(!actor2.ValidationArrayList(actores2))
		{
			System.out.println("La cantidad de actores no debe ser mayor a tres");
		}
		else
		{
			EventoTeatro eventoTeatro2 = new EventoTeatro(actores2, new Genero ("Comedia"),"mucho ruido pocas nueces", Duration.ofMinutes(50), LocalDate.of(2022, 10, 6));
			Entrada entradaTeatro2 = eventoTeatro2.crearEntrada(new Tipo(1, "Teatro" ));
			entradas.add(entradaTeatro2);
		}
		
		 // creando entrada de recital General
		Banda banda = new Banda("mana",new Genero("rock"));
		Banda banda2 = new Banda("soda estereo",new Genero("rock"));
		Banda banda3 = new Banda("Los Palmetas",new Genero("cumbia"));
		
		ArrayList<Banda> bandaSopote=new ArrayList<>();
		bandaSopote.add(banda);
		bandaSopote.add(banda2);
		bandaSopote.add(banda3);
		EventoRecital eventoRecital = new EventoRecital("Cosquín Rock",Duration.ofMinutes(120),LocalDate.of(2022, 10, 10), new Banda("los Beatles",new Genero("rock")),bandaSopote);
		Entrada entradaRecital = eventoRecital.crearEntrada(new Tipo(1,"generales"));
		entradas.add(entradaRecital);

		   // creando entrada de recital VIP
		Banda banda4 = new Banda("U2 ",new Genero("pop"));
		Banda banda5 = new Banda("los diablitos",new Genero("rock"));
		Banda banda6 = new Banda("quinteto",new Genero("cumbia"));
		
		ArrayList<Banda> bandaSopote2=new ArrayList<>();
		bandaSopote2.add(banda4);
		bandaSopote2.add(banda5);
		bandaSopote2.add(banda6);
		EventoRecital eventoRecital2 = new EventoRecital("pop",Duration.ofMinutes(120),LocalDate.of(2022, 7, 7), new Banda("coldplay",new Genero("pop")),bandaSopote2);
		Entrada entradaRecital2 = eventoRecital2.crearEntrada(new Tipo(2,"VIP"));
		entradas.add(entradaRecital2);
		
		ListIterator <Entrada>iterator= entradas.listIterator();
		
		while(iterator.hasNext()) {
			iterator.next().mostrarEntrada();
		}
	}
}
