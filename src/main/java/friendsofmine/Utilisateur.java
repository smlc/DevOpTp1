package friendsofmine;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by walid on 19/10/2016.
 */

@Entity
@Table(name="UTILISATEUR")
public class Utilisateur {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Size(min=1)
    private String nom;

    @NotNull
    @Size(min=1)
    private String prenom;

    @NotNull
    @Pattern(regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
    private String email;

    @NotNull
    @Pattern(regexp = "M|F")
    private String sexe;

    private Date dateNaissance;

    @OneToMany(mappedBy="responsable") @JsonIgnore
    private List<Activite> activites;

    public Utilisateur() {
        this.activites = new ArrayList<>(50);
    }

    public Utilisateur(String nom) {
        this.nom = nom;
        this.activites = new ArrayList<>(50);
    }

    public Utilisateur(String nom, String prenom, String email, String sexe, Date dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.activites = new ArrayList<>(50);
    }

    public Utilisateur(String nom, String prenom, String email, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.sexe = sexe;
        this.activites = new ArrayList<>(50);
    }

    public List<Activite> getActivites() {
        return activites;
    }

    public void setActivites(List<Activite> liste) {
        this.activites = liste;
    }

    public Long getId() {
        return id;
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

    public Date getDateNaissance() {
        return dateNaissance;
    }
}
