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

}
