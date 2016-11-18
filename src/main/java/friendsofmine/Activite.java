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

}
