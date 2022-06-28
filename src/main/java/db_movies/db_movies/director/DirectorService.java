package db_movies.db_movies.director;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DirectorService {
    private final DirectorRepository directorRepository;

    @Autowired
    public DirectorService(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    public List<Director> getDirectors(){
        return directorRepository.findAll();
    }

    public Optional<Director> getDirectorById(Long id){
        return directorRepository.findById(id);
    }

    public Director addDirector(Director director){
        return directorRepository.save(director);
    }

    public void deleteDirector(Long id){
        directorRepository.deleteById(id);
    }

    public void updateDirector(Director directorUpdated){
        Long num = directorUpdated.getId();
        if(directorRepository.findById(num).isPresent()){
            Director directorToUpdate = new Director();

            directorToUpdate.setId(directorUpdated.getId());
            directorToUpdate.setName(directorUpdated.getName());
            directorToUpdate.setAbout(directorUpdated.getAbout());

            directorRepository.save(directorToUpdate);
        }
    }
}
