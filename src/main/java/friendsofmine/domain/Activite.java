package friendsofmine.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by thibauttang on 27/02/2017.
 */

@Entity
public class Activite {

    public Activite(){}

    @Id
    @GeneratedValue
    Long id; // Clé primaire de type Long générée automatiquement (TP2 1.1)

    @NotNull
    @Size(min=1)
    private String titre;

    private String descriptif;

    public Activite(String titre, String descriptif) {
        this.titre = titre;
        this.descriptif = descriptif;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public Long getId() {
        return id;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }
}
