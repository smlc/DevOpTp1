package friendsofmine;

import friendsofmine.repositories.ActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by walid on 26/10/2016.
 */
@Service
public class ActiviteService {

    @Autowired
    ActiviteRepository activiteRepository;

    void saveActivite(Activite a) {
        this.activiteRepository.save(a);
    }

}
