package Question4;
import java.text.ParseException;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws ParseException {
        Date date1 = new GregorianCalendar(1998, Calendar.MARCH, 9).getTime();
        Movie first = new Movie("happy", date1, "Jason Li");
        first.addActors("Emily");
        first.addActors("Leo");
        Date date2 = new GregorianCalendar(2017, Calendar.DECEMBER, 6).getTime();
        Movie second = new Movie("Sas", date2, "Mark Zhao");
        first.addActors("kate");
        first.addActors("zio");
        first.addActors("zkoej");
        Date date3 = new GregorianCalendar(1876, Calendar.MAY, 8).getTime();
        Movie third = new Movie("Run", date3, "Emily Z");
        first.addActors("Michael");
        first.addActors("Pam");
        first.addActors("Jim");
        Date date4 = new GregorianCalendar(2001, Calendar.FEBRUARY, 11).getTime();
        Movie fourth = new Movie("Love Story", date4, "Zoy");
        first.addActors("Eda");
        first.addActors("kate");
        first.addActors("Arouro");
        Date date5 = new GregorianCalendar(2020, Calendar.FEBRUARY, 30).getTime();

        Genre firstG = new Genre();
        Genre secondG = new Genre();
        Genre Third = new Genre();

        firstG.addMovies(first);
        firstG.addMovies(second);
        Third.addMovies(first);
        secondG.addMovies(third);
        secondG.addMovies(fourth);

        Netflix netflix = new Netflix();
        netflix.addGenre(firstG);
        netflix.addGenre(secondG);
        //For all movies released before 2000, add the string "(Classic)" to the title of the movie
        // using flatMap and to get the latest 3 movies
        Date dateCheck = new GregorianCalendar(2000, Calendar.JANUARY, 01).getTime();
        List<String> movies =
                netflix.genres.stream().
                        flatMap((genre)-> genre.moviesList().stream()).
                        filter(m -> m.getReleaseDate().before(dateCheck))
                        .map(n -> "classic"+ n.getTitle()).
                        collect(Collectors.toList());
        List<String> latest = netflix.genres.stream().
                flatMap((genre) -> genre.moviesList().stream()).
                sorted((m1, m2) -> m2.getReleaseDate().compareTo(m2.getReleaseDate())).
                limit(3).map(m -> m.getTitle()).collect(Collectors.toList());

        //Create a predicate for release date before 2000 and a predicate for release date before 1990
        //and then Chain the predicates for finding movies between 1990 and 2000.
        Date predicateDate1 = new GregorianCalendar(1990, Calendar.JANUARY, 01).getTime();
        Date predicateDate2 = new GregorianCalendar(2000, Calendar.JANUARY, 01).getTime();
        Predicate<Date> before1990 = (date -> date.before(predicateDate1));
        Predicate<Date> before2000 = (date -> date.before(predicateDate2));
        //List of movies from all genres
        List<Movie> movieList = netflix.genres.stream().
                flatMap(genre -> genre.moviesList().stream()).collect(Collectors.toList());
        for(Movie movie : movieList){
            if(before1990.and(before2000).test(movie.getReleaseDate())){
                System.out.println(movie.getTitle());
            }
        }
        //Write a method which that will add release year in the title of the movie and return
        // the title and then use this method for all the movies.
        BiFunction<Date, String, String> merge = (date, str) ->{
            String merged = date.toString() + str;
            return merged;
        };
        for(Movie movie : movieList){
            merge.apply(movie.getReleaseDate(), movie.getTitle());
        }
        //Sorting on one of the feature(Ex: title) which will use comparator.
        Collections.sort(movieList, (m1,m2) -> m1.getTitle().compareTo(m2.getTitle()));
    }
}