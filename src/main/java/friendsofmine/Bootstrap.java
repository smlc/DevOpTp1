package friendsofmine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by walid on 04/11/2016.
 */

@Component
public class Bootstrap {

    @Autowired
    InitialisationService initialisationService;

    @PostConstruct
    public void init() {
        try {
            initialisationService.initActivites();
            initialisationService.initInscriptions();
        }
        catch (RuntimeException rte) {
            rte.printStackTrace();
        }
    }

}
