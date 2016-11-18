package friendsofmine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by walid on 04/11/2016.
 */

@Service
public class InitialisationService {

    private Utilisateur mary = new Utilisateur("Mary", "Mary", "mary@test.fr", "F", new Date());
    private Utilisateur thom = new Utilisateur("Thom", "Thom", "thom@test.fr", "M", new Date());

    private Activite lindyHop = new Activite("lindiHop", "Cool", mary);
    private Activite randonnee = new Activite("randonnee", "Cool", mary);
    private Activite taekwondo = new Activite("taekwondo", "Cool", thom);

    @Autowired
    ActiviteService activiteService;

    @Autowired
    Bootstrap bootstrap;

    public void initActivites() {
        activiteService.saveActivite(lindyHop);
        activiteService.saveActivite(randonnee);
        activiteService.saveActivite(taekwondo);
    }
}
