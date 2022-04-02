package view;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
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
		EventoInfantil eventoInfantil = new EventoInfantil(false,"El sapo Pepe", Duration.ofMinutes(45), LocalDate.of(2022, 5, 20));	
		Entrada entradaInfantil1 = eventoInfantil.crearEntrada(new Tipo(1,"menor"));
		entradaInfantil1.mostrarEntrada();
		
		//Evento Deportivo
		EventoDeportivo eventoDeportivo = new EventoDeportivo("Final Copa América", Duration.ofMinutes(90), LocalDate.of(2022, 8, 25), new Deporte("futbol"), true);	
		Entrada entradaDeportiva = eventoDeportivo.crearEntrada(new Tipo(1,"futbol"));	
		entradaDeportiva.mostrarEntrada();
		
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
			entradaTeatro.mostrarEntrada();
			//System.out.println(entradaTeatro.toString());
		}
		 //Evento Recital
		Banda banda = new Banda("mana",new Genero("rock"));
		Banda banda2 = new Banda("soda estereo",new Genero("rock"));
		Banda banda3 = new Banda("Los Palmetas",new Genero("cumbia"));
		
		ArrayList<Banda> bandaSopote=new ArrayList<>();
		bandaSopote.add(banda);
		bandaSopote.add(banda2);
		bandaSopote.add(banda3);
		EventoRecital eventoRecital = new EventoRecital("Cosquín Rock",Duration.ofMinutes(120),LocalDate.of(2022, 10, 10), new Banda("los Beatles",new Genero("rock")),bandaSopote);
		Entrada entradaRecital = eventoRecital.crearEntrada(new Tipo(1,"generales"));
		entradaRecital.mostrarEntrada();
		//System.out.println(entradaRecital.toString());
	}
}
