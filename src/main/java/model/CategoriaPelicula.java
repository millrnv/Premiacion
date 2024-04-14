package model;

public enum CategoriaPelicula {
	ACCION("Accion"), TERROR("Terror"), DRAMA("Drama");

	private String categoria;

	private CategoriaPelicula(String categoria) {
		this.categoria = categoria;
	}

	public String getCategoria() {
		return this.categoria;
	}


}