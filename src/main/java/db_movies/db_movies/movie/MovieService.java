package db_movies.db_movies.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service

public class MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getMovies(){
        return this.movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(Long id){
        return movieRepository.findById(id);
    }

    public Movie addMovie(Movie newMovie){
        return movieRepository.save(newMovie);
    }

    public void deleteMovie(Long id){
        movieRepository.deleteById(id);
    }

    public void updateMovie(Movie movieUpdated){
        Long num = movieUpdated.getId();
        if(movieRepository.findById(num).isPresent()){
            Movie movieToUpdate = new Movie();

            movieToUpdate.setId(movieUpdated.getId());
            movieToUpdate.setTitle(movieUpdated.getTitle());
            movieToUpdate.setYear(movieUpdated.getYear());
            movieToUpdate.setImageUrl(movieUpdated.getImageUrl());
            movieToUpdate.setCertificate(movieUpdated.getCertificate());
            movieToUpdate.setRuntime(movieUpdated.getRuntime());
            movieToUpdate.setImdbRating(movieUpdated.getImdbRating());
            movieToUpdate.setInfo(movieUpdated.getInfo());
            movieToUpdate.setMetaScore(movieUpdated.getMetaScore());
            movieToUpdate.setVotes(movieUpdated.getVotes());
            movieToUpdate.setGross(movieUpdated.getGross());

            movieRepository.save(movieToUpdate);
        }
    }
}
