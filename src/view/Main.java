package view;
import model.ListasPrecios;
import entities.Tipo;

public class Main {

	public static void main(String[] args) {
		ListasPrecios lista= new ListasPrecios();
		System.out.println("Lista de Precios");
		System.out.println("Recitales");
		System.out.println("Generales: $"+lista.getEntradaRecital(new Tipo(1,"generales")));
		System.out.println("VIP: $"+lista.getEntradaRecital(new Tipo(2,"vip")));
		System.out.println("Teatro");
		System.out.println("Unica: $"+lista.getEntradaTeatro());
		System.out.println("Infantiles");
		System.out.println("Menos de 8 años: $"+lista.getEntradaInfantiles(new Tipo(1,"menor")));
		System.out.println("Menos de 8 años: $"+lista.getEntradaInfantiles(new Tipo(2,"mayor")));
		System.out.println("Deportes");
		System.out.println("Futbol: $"+lista.getEntradaDeporte(new Tipo(1,"futbol")));
		System.out.println("Futbol: $"+lista.getEntradaDeporte(new Tipo(2,"rugby")));
		System.out.println("Futbol: $"+lista.getEntradaDeporte(new Tipo(3,"jockey")));
		

	}

}
