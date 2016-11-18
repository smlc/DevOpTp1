package friendsofmine;

import friendsofmine.repositories.ActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolationException;

/**
 * Created by mars on 26/10/16.
 */

@Service
public class ActiviteService {

    @Autowired
    ActiviteRepository activiteRepository;

    @Autowired
    UtilisateurService utilisateurService;

    public void saveActivite(Activite activite) {

        if (activite.getResponsable() == null) {
            throw new ConstraintViolationException(null);
        } else if (activite.getResponsable().getId() == null) {
            utilisateurService.saveUtilisateur(activite.getResponsable());
        }

        if (!activite.getResponsable().getActivites().contains(activite)){
            activite.getResponsable().getActivites().add(activite);
            activiteRepository.save(activite);
        }

    }

    public Iterable<Activite> findAllActivites(){
        return this.activiteRepository.findAll(new Sort("titre"));
    }

}
