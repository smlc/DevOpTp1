package friendsofmine;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by alpha on 25/11/2016.
 */
public class Inscription {
    @NotNull
    private Utilisateur utilisateur;

    @NotNull
    private Activite activite;

    @NotNull
    private Date dateInscription;
}
