package model;

import java.util.ArrayList;

public class Actor extends Participante {

	private ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

	//Constructor
	public Actor(String nombre, String apellido, String nacionalidad){
		super(nombre, apellido, nacionalidad);
	}

	public String getTipo() {
		return "Actor";
	}
}