package friendsofmine;

import friendsofmine.repositories.ActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mars on 26/10/16.
 */

@Service
public class ActiviteService {
    @Autowired
    ActiviteRepository activiteRepository;

    public void saveActivite(Activite activite){
        activiteRepository.save(activite);
    }

}
