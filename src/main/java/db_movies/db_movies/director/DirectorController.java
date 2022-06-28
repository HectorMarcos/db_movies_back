package db_movies.db_movies.director;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(path = "movies_api/directors")
public class DirectorController {

    private final DirectorService directorService;

    @Autowired
    public DirectorController(DirectorService directorService) {
        this.directorService = directorService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Director> getDirectors(){
        return directorService.getDirectors();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Director> getDirectorById(@PathVariable Long id){
        return directorService.getDirectorById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Director addDirector(Director newDirector){
        return directorService.addDirector(newDirector);
    }

    @RequestMapping(value = "/remove/{id}")
    public void removeDirector(@PathVariable Long id){
        directorService.deleteDirector(id);
    }

    @RequestMapping(value = "/update")
    public void updateDirector(Director directorUpdated){
        directorService.updateDirector(directorUpdated);
    }


}
