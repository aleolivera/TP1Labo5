package entities;

public class Actor {
	private long id;
	private String nombreActor;	
	
	public Actor(String nombreActor, long id) {
		super();
		this.nombreActor= nombreActor;
		this.id = id;
	}

	public Actor() {

	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", nombreActor=" + nombreActor + "]";
	}

	public String getNombreActor() {
		return nombreActor;
	}

	public void setNombreActor(String nombreActor) {
		this.nombreActor = nombreActor;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
}
