package friendsofmine;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by alpha on 25/11/2016.
 */
@Entity
public class Inscription {
    @Id
    @GeneratedValue
    Long id;

    @NotNull
    @OneToOne
    private Utilisateur utilisateur;

    @NotNull
    @OneToOne
    private Activite activite;

    @NotNull
    private Date dateInscription;

    @PrePersist
    public void initCreationDate() {
        dateInscription = new Date();
    }

}
