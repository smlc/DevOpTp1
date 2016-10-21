package friendsofmine;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by walid on 19/10/2016.
 */

@Entity
public class Utilisateur {

    @Id
    private Long id;

    @NotNull
    @NotBlank
    private String nom;

    @NotNull
    @NotBlank
    private String prenom;

    @NotNull
    @Email
    private String email;

    @NotNull
    @NotBlank
    private String sexe;

    private Date dateNaissance;

}
