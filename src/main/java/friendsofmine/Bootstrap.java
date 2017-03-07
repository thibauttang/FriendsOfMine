package friendsofmine;

import friendsofmine.domain.Activite;
import friendsofmine.domain.Utilisateur;

import friendsofmine.service.InitialisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

/**
 * Created by thibauttang on 28/02/2017.
 */

@Component
public class Bootstrap {


    @Autowired
    private InitialisationService initialisationService;


    @PostConstruct
    public void init(){
        initialisationService.initDonnees();
    }


    public ArrayList<Utilisateur> getUtilisateurs(){
        return initialisationService.getListUtilisateurs();
    }

    public ArrayList<Activite> getActivites(){
        return initialisationService.getListActivites();
    }

}
