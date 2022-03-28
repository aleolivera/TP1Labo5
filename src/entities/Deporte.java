package entities;

public class Deporte {
	private long id;
	private String nombre;
	
	private static long contador = 0;
	
	//Getters y setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Constructor con parámetro
	public Deporte(String nombre) {
		super();
		this.id = ++contador;
		this.nombre = nombre;
	}
	
	//Constructor sin parámetro
	public Deporte() {
		super();
		this.id = ++contador;
	}
	
	//toString
	@Override
	public String toString() {
		return "Id deportivo= " + id + ", Tipo de deporte=" + nombre + " ";
	}
	
	
	
}
