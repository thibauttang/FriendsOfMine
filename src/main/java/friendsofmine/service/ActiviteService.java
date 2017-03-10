package friendsofmine.service;

import friendsofmine.domain.Activite;
import friendsofmine.repositories.ActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by thibauttang on 10/03/2017.
 */

@Service
public class ActiviteService {

    private ActiviteRepository activiteRepository;

    @Autowired
    public void setActiviteRepository(ActiviteRepository activiteRepository) {
        this.activiteRepository = activiteRepository;
    }

    public Activite saveActivite(Activite activite) {
        if(activite == null) {
            IllegalArgumentException exception = new IllegalArgumentException("exception");
            throw exception;
        }
        else {
            return activiteRepository.save(activite);
        }
    }

    public Activite findOneActivite(Long id) {
        return activiteRepository.findOne(id);
    }

    public long countActivite() {
        return activiteRepository.count();
    }

    public ActiviteRepository getActiviteRepository() {
        return activiteRepository;
    }
}
