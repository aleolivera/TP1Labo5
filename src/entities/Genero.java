package entities;

public class Genero {
	private int id;
	private String nombreGenero;
	private static int contador=0;
	
	//Constructores inicio
	public Genero(String nombreGenero) {
		super();
		this.nombreGenero = nombreGenero;
		id=++contador;
	}

	public Genero() {
		super();
		id=++contador;
	}
	//constructores fin


	//metodo toString inicio
	@Override
	public String toString() {
		return "Genero [id=" + id + ", nombreGenero=" + nombreGenero + "]";
	}
	//metodo toString fin

	
	//getters y setters inicio
	public String getNombreGenero() {
		return nombreGenero;
	}

	public void setNombreGenero(String nombreGenero) {
		this.nombreGenero = nombreGenero;
	}

	public int getId() {
		return id;
	}
	//getters y setters fin
	
}
