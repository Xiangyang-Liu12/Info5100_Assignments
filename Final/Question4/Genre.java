package Question4;

import java.util.ArrayList;
import java.util.List;

public class Genre {
    private List<Movie> movies;

    public Genre(){
        movies = new ArrayList<>();
    }

    public void addMovies(Movie movie){
        movies.add(movie);
    }

    public List<Movie> moviesList(){
        return movies;
    }
}

