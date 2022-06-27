package db_movies.db_movies.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(path = "movies_api/movies")

public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Movie> getMovies(){
        return movieService.getMovies();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Movie> getMovieById(@PathVariable Long id){
        return movieService.getMovieById(id);
    }

    @RequestMapping(value = "/add")
    public Movie addMovie(Movie newMovie){
        return movieService.addMovie(newMovie);
    }

    @RequestMapping(value = "/remove/{id}", method = RequestMethod.DELETE)
    public void removeMovie(@PathVariable Long id){
        movieService.deleteMovie(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void updateMovie(Movie movieUpdated){
        movieService.updateMovie(movieUpdated);
    }
}
