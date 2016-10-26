package friendsofmine;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by walid on 19/10/2016.
 */

@Entity
@Table(name="Activite")
public class Activite {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @NotBlank
    @Column(name="TITRE")
    private String titre;

    @Column(name="DESCRIPTIF")
    private String descriptif;

}
