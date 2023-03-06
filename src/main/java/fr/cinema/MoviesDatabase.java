package fr.cinema;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MoviesDatabase {

    private String file = "../resources/movies.csv";
    
    public String readAllMovies() {

        final var pathToFile = Paths.get(this.file);
        System.out.println(pathToFile.toAbsolutePath());
        try {
            
            //List<String> lines = Files.readAllLines(pathToFile);
            
            var lines = Files.readAllLines(pathToFile);
            System.out.println(lines);
            
           
        } catch (IOException e) {
             //fail(String.format("Unable to read %s", pathToFile), e);
             System.out.println(e);
        }
        return null;
    }
}
// /src/main/resources/movies.csv
