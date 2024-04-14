package model;

import java.util.Date;

public class Pelicula {
	private Date fechaEstreno;
	private String titulo;
	private double duracion;
	private String sinopsis;
	private Director director;
	private Actor actor;
	public CategoriaPelicula unnamed_CategoriaPelicula_;

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
}