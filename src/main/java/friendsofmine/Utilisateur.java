package friendsofmine;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * Created by walid on 19/10/2016.
 */

@Entity
@Table(name="Utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @NotBlank
    @Column(name="NOM")
    private String nom;

    @NotNull
    @NotBlank
    @Column(name="PRENOM")
    private String prenom;

    @NotNull
    @Email
    @Column(name="EMAIL")
    private String email;

    @NotNull
    @NotBlank
    @Pattern(regexp = "M|F")
    @Column(name="SEXE")
    private String sexe;

    @Column(name="DATE")
    private Date dateNaissance;

}
