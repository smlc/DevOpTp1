package friendsofmine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by walid on 04/11/2016.
 */

@Component
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
