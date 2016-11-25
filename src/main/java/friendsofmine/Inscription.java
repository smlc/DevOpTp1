package friendsofmine;

import org.springframework.data.jpa.repository.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by walid on 25/11/2016.
 */

@Entity
@Table(name="INSCRIPTION")
public class Inscription {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @OneToOne
    Utilisateur utilisateur;

    @NotNull
    @OneToOne
    Activite activite;

    @NotNull
    Date dateInscription;

    public Inscription() {
    }

    public Inscription(Utilisateur utilisateur, Activite activite) {
        this.utilisateur = utilisateur;
        this.activite = activite;
    }

    public Inscription(Utilisateur utilisateur, Activite activite, Date dateInscription) {
        this.utilisateur = utilisateur;
        this.activite = activite;
        this.dateInscription = dateInscription;
    }

    @PrePersist
    public void setInitialDate () {
        this.setDateInscription(new Date());
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Activite getActivite() {
        return activite;
    }

    public void setActivite(Activite activite) {
        this.activite = activite;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
