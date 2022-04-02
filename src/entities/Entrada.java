package entities;

public class Entrada {
	private Evento evento;
	private Tipo tipoEntrada;
	private double importe;
	private final long id;
	
	private static long contador=0; 
	
	//constructor para los eventos en general
	public Entrada(Tipo tipoEntrada, double importe) {
		super();
		this.tipoEntrada = tipoEntrada;
		this.importe = importe;
		this.id=++contador;
	}
	
	//constructor vacio
	public Entrada() {
		super();
		this.id=++contador;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Tipo getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(Tipo tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Entrada: evento= " + evento.toString() + ", tipo entrada= "
				+ tipoEntrada.getNombre() + ", importe= $" + importe + "-. , Id de entrada= " + id;
	}
	
	public void mostrarEntrada() {
	
		System.out.println("_______________ENTRADA____________");
		this.evento.mostrarEvento();
		System.out.println("----------------------------------");
		System.out.println("Entrada Nº: " + this.id);
		System.out.println("Tipo de entrada: " + this.tipoEntrada.getNombre());
		System.out.println("importe: $"+ this.importe +"-.");
		System.out.println("__________________________________");
		System.out.println();
	}
}
