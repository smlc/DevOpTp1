package friendsofmine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by alpha on 18/11/2016.
 */

@RestController
public class ActiviteController {

    @Autowired
    ActiviteService activiteService;

    @RequestMapping("/activitesWithResponsable")
    public Iterable<Activite> findAllActvitesWithResponsable() {

        return activiteService.findAllActivites();
    }

}
