package controller;
import model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        inicializar();


    }

    public static void inicializar(){

        GestionPremiacion gestion = new GestionPremiacion();

        Participante actor1 = new Actor("Juan", "Perez", "Argentina");
        Participante actor2 = new Actor("Pedro", "Gomez", "Chile");
        Participante actor3 = new Actor("Maria", "Lopez", "Peru");
        Participante actor4 = new Actor("Ana", "Rodriguez", "Brasil");
        Participante actor5 = new Actor("Jose", "Garcia", "Colombia");
        Participante actor6 = new Actor("Luis", "Subiabre", "Colombia");
        Participante actor7 = new Actor("Carlos", "Garcia", "España");
        Participante actor8 = new Actor("Luis", "Lopez", "Uruguay");


        Participante director1 = new Director("Carlos", "Cepeda", "España");
        Participante director2 = new Director("Ignacio", "Martinez", "Argentina");
        Participante director3 = new Director("Luis", "Anazco", "Chile");
        Participante director4 = new Director("Pedro", "Ruminot", "Venezuela");

        Pelicula pelicula1 = new Pelicula(new Date(18/04/2024), "Aventura", 120, "Un grupo de amigos planea un robo", true, CategoriaPelicula.ACCION);
        Pelicula pelicula2 = new Pelicula(new Date(18/04/2024), "Comedia", 90, "Un grupo de amigos planea un robo", false, CategoriaPelicula.TERROR);
        Pelicula pelicula3 = new Pelicula(new Date(18/04/2024), "Drama", 100, "Un grupo de amigos planea un robo", false, CategoriaPelicula.DRAMA);

        pelicula1.agregarActor((Actor) actor1);
        pelicula1.agregarActor((Actor) actor2);
        pelicula1.agregarActor((Actor) actor3);

        pelicula2.agregarActor((Actor) actor4);
        pelicula2.agregarActor((Actor) actor5);
        pelicula2.agregarActor((Actor) actor6);

        pelicula3.agregarActor((Actor) actor7);
        pelicula3.agregarActor((Actor) actor8);

        //Peliculas ganadoras
        System.out.println("Peliculas ganadoras de la categoria ACCION: " + gestion.peliculasGanadoras(CategoriaPelicula.ACCION));











    }
}