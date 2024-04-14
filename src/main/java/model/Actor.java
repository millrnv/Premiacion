package model;

import java.util.ArrayList;

public class Actor extends Participante {

	//Constructor
	public Actor(String nombre, String apellido, String nacionalidad){
		super(nombre, apellido, nacionalidad);
	}
	private ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

	public String getTipo() {
		return "Actor";
	}
}