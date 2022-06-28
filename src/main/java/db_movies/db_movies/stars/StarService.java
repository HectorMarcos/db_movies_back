package db_movies.db_movies.stars;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class StarService {
    private final StarRepository starRepository;

    @Autowired
    public StarService(StarRepository starRepository) {
        this.starRepository = starRepository;
    }

    public List<Star> getStars(){
        return starRepository.findAll();
    }

    public Optional<Star> getStarById(Long id){
        return starRepository.findById(id);
    }

    public Star addStar(Star star){
        return starRepository.save(star);
    }

    public void deleteStar(Long id){
        starRepository.deleteById(id);
    }

    public void updateStar(Star starUpdated){
        Long num = starUpdated.getId();
        if(starRepository.findById(num).isPresent()){
            Star starToUpdate = new Star();

            starToUpdate.setId(starUpdated.getId());
            starToUpdate.setName(starToUpdate.getName());
            starToUpdate.setAbout(starToUpdate.getAbout());

            starRepository.save(starToUpdate);
        }
    }
}
