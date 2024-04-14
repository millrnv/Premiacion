package model;

import java.util.ArrayList;
import java.util.List;

public class GestionPremiacion {
	private ArrayList<Director> directores = new ArrayList<Director>();
	private ArrayList<Jurado> jurados = new ArrayList<Jurado>();
	private ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

	//Constructor
	public GestionPremiacion(){
	}


	public void agregarDirector(Director director){
		directores.add(director);
	}

	public void agregarJurado(Jurado jurado){
		jurados.add(jurado);
	}

	public void agregarPelicula(Pelicula pelicula){
		peliculas.add(pelicula);
	}



	public List<Pelicula> peliculasGanadoras(CategoriaPelicula categoria) {
		List<Pelicula> peliculasGanadoras = new ArrayList<Pelicula>();

		for(Pelicula pelicula : peliculas){
			if(pelicula.getCategoriaPelicula().equals(categoria) && pelicula.isPeliculaGanadora()){
				peliculasGanadoras.add(pelicula);
			}
		}
		return peliculasGanadoras;
	}

	public List<Actor> todosLosActoresParticipantesUnaPelicula(Pelicula pelicula) {
		List<Actor> actoresPelicula = new ArrayList<Actor>();
		for(Actor actor : pelicula.getActores()){
			actoresPelicula.add(actor);
		}
		return actoresPelicula;
	}

	public List<Actor> actoresPeliculaGanadora() {
		List<Actor> actoresPeliculaGanadora = new ArrayList<Actor>();
		for(Pelicula pelicula : peliculas){
			if(pelicula.isPeliculaGanadora()){
				for(Actor actor : pelicula.getActores()){
					actoresPeliculaGanadora.add(actor);
				}
			}
		}
		return actoresPeliculaGanadora;
	}

	public List<Participante> directoresYActoresQueSonPartePremiacion() {
		List<Participante> participantes = new ArrayList<Participante>();
		for(Director director : directores){
			participantes.add(director);
		}
		for(Pelicula pelicula : peliculas){
			for(Actor actor : pelicula.getActores()){
				participantes.add(actor);
			}
		}
		return participantes;
	}
}