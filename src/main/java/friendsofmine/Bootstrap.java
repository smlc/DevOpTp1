package friendsofmine;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by walid on 04/11/2016.
 */

public class Bootstrap {

    @Autowired
    InitialisationService initialisationService;

    public void init() {
        try {
            initialisationService.initActivites();
        }
        catch (RuntimeException rte) {

        }
    }

}
