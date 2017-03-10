package friendsofmine.domain;

import org.springframework.stereotype.Controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by thibauttang on 28/02/2017.
 */

@Entity
public class Utilisateur {

    public Utilisateur(){}

    @Id @GeneratedValue
    long id; // Clé primaire de type Long générée automatiquement (TP2 1.1)

    @NotNull
    @Size(min=1)
    private String nom;

    @NotNull
    @Size(min=1)
    private String prenom;

    @NotNull
    @Pattern(regexp="^[a-zA-Z-]+@[a-zA-Z-]+\\.[a-zA-Z]{2,6}$")
    private String email;

    @NotNull
    @Pattern(regexp="M|F")
    private String sexe;

    private Date date;

    public Utilisateur(String nom, String prenom, String email, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.sexe = sexe;
    }


    public Utilisateur(String nom, String prenom, String email, String sexe, Date date) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.sexe = sexe;
        this.date = date;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getSexe() {
        return sexe;
    }

    public Date getDate() {
        return date;
    }

    public Long getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
