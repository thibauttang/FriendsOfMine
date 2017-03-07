package friendsofmine.service;

import friendsofmine.domain.Utilisateur;
import friendsofmine.domain.Activite;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by thibauttang on 28/02/2017.
 */

@Service
public class InitialisationService {


    private ArrayList<Utilisateur> listUtilisateurs = new ArrayList<>();
    private ArrayList<Activite> listActivites = new ArrayList<>();


    public void initDonnees(){
        listUtilisateurs.add(new Utilisateur("Tang", "Thibaut", "thibaut.tang@gmail.com", "M"));
        listUtilisateurs.add(new Utilisateur("Foissac", "Léa", "lea.foissac@gmail.com", "F"));
        listUtilisateurs.add(new Utilisateur("Guilbert", "Sarah", "sarah.guilbert@gmail.com", "F"));
        listUtilisateurs.add(new Utilisateur("De Lima", "Marianna", "marianna.delima@gmail.com", "F"));
        listUtilisateurs.add(new Utilisateur("Laurent", "Théo", "theo.laurent@gmail.com", "M"));

        listActivites.add(new Activite("Tennis", "Ca se joue avec une raquette et une balle"));
        listActivites.add(new Activite("Bowling", "Il faut lancer une boule pour faire tomber des quilles"));
        listActivites.add(new Activite("Manger", "En solo ou à plusieurs, c'est toujours bien de manger"));
    }


    public ArrayList<Utilisateur> getListUtilisateurs() {
        return listUtilisateurs;
    }


    public ArrayList<Activite> getListActivites() {
        return listActivites;
    }


}
