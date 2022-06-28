package db_movies.db_movies.genres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(path = "movies_api/genres")
public class GenreController {

    private final GenreService genreService;

    @Autowired
    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Genre> getGenres(){
        return genreService.getGenres();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Genre> getGenreById(@PathVariable Long id){
        return genreService.getGenreById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Genre addGenre(Genre newGenre){
        return genreService.addGenre(newGenre);
    }

    @RequestMapping(value = "/remove/{id}")
    public void removeGenre(@PathVariable Long id){
        genreService.deleteGenre(id);
    }

    @RequestMapping(value = "/update")
    public void updateGenre(Genre genreUpdated){
        genreService.updateGenre(genreUpdated);
    }

    @RequestMapping(value = "/test")
    public Long test(){
        return genreService.testGenre();
    }
}
