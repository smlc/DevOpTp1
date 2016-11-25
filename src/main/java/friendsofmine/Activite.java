package friendsofmine;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by walid on 19/10/2016.
 */

@Entity
@Table(name="ACTIVITE")
public class Activite {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Size(min=1)
    private String titre;

    private String descriptif;

    @NotNull
    @ManyToOne
    private Utilisateur responsable;

    public Activite() {
    }

    public Activite(String titre, Utilisateur responsable) {
        this.titre = titre;
        this.responsable = responsable;
    }

    public Activite(String titre, String descriptif, Utilisateur responsable) {
        this.titre = titre;
        this.descriptif = descriptif;
        this.responsable = responsable;
    }

    public Utilisateur getResponsable() {
        return responsable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public void setResponsable(Utilisateur responsable) {
        this.responsable = responsable;
    }
}