package db_movies.db_movies.genres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GenreService {
    private final GenreRepository genreRepository;

    @Autowired
    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public List<Genre> getGenres(){
        return genreRepository.findAll();
    }

    public Optional<Genre> getGenreById(Long id){
        return genreRepository.findById(id);
    }

    public Genre addGenre(Genre genre){
        return genreRepository.save(genre);
    }

    public void deleteGenre(Long id){
        genreRepository.deleteById(id);
    }

    public void updateGenre(Genre genreUpdated){
        Long num = genreUpdated.getId();
        if(genreRepository.findById(num).isPresent()){
            Genre genreToUpdate = new Genre();

            genreToUpdate.setId(genreUpdated.getId());
            genreToUpdate.setName(genreUpdated.getName());

            genreRepository.save(genreToUpdate);
        }
    }

    public Long testGenre(){
        Long test = genreRepository.count();
        return test;
    }
}
