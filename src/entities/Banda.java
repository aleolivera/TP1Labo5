package entities;

public class Banda {

	private String nombre;
	private Genero genero;
	private static long   id=0;
	
	public Banda(String nombre,Genero genero) {
		super();
		this.nombre=nombre;
		this.genero=genero;	
		id++;
	}
	
	public Banda(){
		super();
		id++;
	}
	
	
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
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Banda " + nombre + ", genero=" + genero.getNombreGenero() + "";
		                       
	}
}