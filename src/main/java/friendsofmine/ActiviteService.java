package friendsofmine;

import friendsofmine.repositories.ActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolationException;

/**
 * Created by mars on 26/10/16.
 */

@Service
public class ActiviteService {
    @Autowired
    ActiviteRepository activiteRepository;

    public Activite saveActivite(Activite activite) {
        activiteRepository.save(activite);
        Utilisateur ut = activite.getResponsable();
        if (!ut.getActivites().contains(activite)) {

ut.getActivites().add(activite);

        }
        return activite;
    }
}
