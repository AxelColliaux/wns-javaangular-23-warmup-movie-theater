package fr.cinema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        MoviesDatabase readMovies = new MoviesDatabase();
        String content = readMovies.readAllMovies();
        System.out.println(content);

        System.out.println("Bienvenue cher client, quel film voulez vous voir ?");
        
        // input titre a chercher :))
        // Scanner searchFilm = new Scanner(System.in); 
        // String filmTitle = searchFilm.nextLine();
        // System.out.println("Le film recheché est : " + filmTitle);

        // methode 3  suggerée :
        String film = System.console().readLine();
        System.out.println("Le film recheché est : " + film);

        
    }
}

// csv : https://thierry-leriche-dessirier.developpez.com/tutoriels/java/charger-donnees-fichier-csv-5-min/
