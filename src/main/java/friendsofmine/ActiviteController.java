package friendsofmine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alpha on 18/11/2016.
 */

@RestController
public class ActiviteController {

    @Autowired
    ActiviteService activiteService;

    public Iterable<Activite> findAllActvitesWithResponsable() {
        return activiteService.findAllActivites();
    }

}
