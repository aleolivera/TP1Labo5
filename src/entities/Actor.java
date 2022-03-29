package entities;

import java.util.ArrayList;

public class Actor {
	private int id;
	private String nombreActor;	


	public Actor(int id, String nombreActor) {
		this.id = id;
		this.nombreActor = nombreActor;
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
	
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean ValidationArrayList (ArrayList<Actor> actores)
	{
		if(actores.size()> 3)
		{
			return false;
		}
		
		return true;
	}
}
