package friendsofmine.service;

import friendsofmine.domain.Utilisateur;
import friendsofmine.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by thibauttang on 10/03/2017.
 */

@Service
public class UtilisateurService {

    private UtilisateurRepository utilisateurRepository;

    @Autowired
    public void setActiviteRepository(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public Utilisateur findOneUtilisateur(Long id) {
        return utilisateurRepository.findOne(id);
    }

    public long countUtilisateur() {
        return utilisateurRepository.count();
    }

    public UtilisateurRepository getUtilisateurRepository() {
        return utilisateurRepository;
    }
}
