package fr.cinema;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MoviesDatabase {

    private String file = "../resources/movies.csv";
    
    public List<String> readAllMovies() {
        Path pathToFile = Paths.get(this.file);

        System.out.println(pathToFile.toAbsolutePath());
        try {           
          
            List<String> lines = Files.readAllLines(pathToFile);
            return lines;
            //System.out.println(lines);          
           
        } catch (IOException e) {
             //fail(String.format("Unable to read %s", pathToFile), e);
             System.out.printf("Unable to read %s", pathToFile, e);
        }
        return null;
    }

    public String getMovieInfo(String movieName) {

        List<String> lines = readAllMovies();
        
        for (String line: lines) {
            if (line.contains(movieName)) {
                return line;
            }
        }
        return null;
    }
}
// /src/main/resources/movies.csv
