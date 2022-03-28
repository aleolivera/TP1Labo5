package entities;

public class Deporte {
	private long id;
	private String nombre;
	
	private static long contador = 0;
	
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
	
	
	//toString
	@Override
	public String toString() {
		return "Tipo de deporte=" + nombre + ", Id deportivo= " + id;
	}
	
	
	
}
