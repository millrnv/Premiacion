package model;

import java.util.ArrayList;

public class Director extends Participante {
	private ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
	private GestionPremiacion gestionPremiacion;

	//Constructor
	public Director(String nombre, String apellido, String nacionalidad){
		super(nombre, apellido, nacionalidad);


	}

	public boolean avisoPrevio() {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		return "Director";
	}
}