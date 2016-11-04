package friendsofmine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by walid on 04/11/2016.
 */

@Service
public class InitialisationService {

    @Autowired
    ActiviteService activiteService;

    @Autowired
    Bootstrap bootstrap;

    public void initActivites() {
    }
}
