package friendsofmine;


import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


/**
 * Created by walid on 19/10/2016.
 */

@Entity
public class Activite {


    @NotNull
    @Id
    private Long id;

    @NotNull
    @NotBlank
    private String titre;
    private String descriptif;


}
