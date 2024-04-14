package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pelicula {
	private Date fechaEstreno;
	private String titulo;
	private double duracion;
	private String sinopsis;
	private Director director;
	private List<Actor> actores;
	private boolean peliculaGanadora;
	public CategoriaPelicula CategoriaPelicula;

	//Constructor
	public Pelicula(Date fechaEstreno, String titulo, double duracion, String sinopsis, boolean peliculaGanadora, CategoriaPelicula categoriaPelicula){
		this.fechaEstreno = fechaEstreno;
		this.titulo = titulo;
		this.duracion = duracion;
		this.sinopsis = sinopsis;
		this.peliculaGanadora = peliculaGanadora;
		this.CategoriaPelicula = categoriaPelicula;
		this.actores = new ArrayList<>();

	}

	public Date getFechaEstreno() {
		return this.fechaEstreno;
	}

	public void setFechaEstreno(Date fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracion() {
		return this.duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public String getSinopsis() {
		return this.sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public boolean isPeliculaGanadora() {
		return this.peliculaGanadora;
	}

	public void setPeliculaGanadora(boolean peliculaGanadora) {
		this.peliculaGanadora = peliculaGanadora;
	}

	public CategoriaPelicula getCategoriaPelicula() {
		return this.CategoriaPelicula;
	}

	public void setCategoriaPelicula(CategoriaPelicula CategoriaPelicula) {
		this.CategoriaPelicula = CategoriaPelicula;
	}

	public List<Actor> getActores() {
		return actores;
	}

	public void setActores(List<Actor> actores) {
		this.actores = actores;
	}

	public void agregarActor(Actor actor){
		actores.add(actor);
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public String toString(){
		return "Titulo: " + titulo + " - Director: " + director.getNombre();

	}


}