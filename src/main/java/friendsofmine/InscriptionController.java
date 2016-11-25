package friendsofmine;

import friendsofmine.repositories.ActiviteRepository;
import friendsofmine.repositories.InscriptionRepository;
import friendsofmine.repositories.UtilisateurRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by walid on 25/11/2016.
 */

@RestController
public class InscriptionController {

    InscriptionRepository inscriptionRepository;
    UtilisateurRepository utilisateurRepository;
    ActiviteRepository activiteRepository;

    public void addInscription(Long l1, Long l2) {
        Activite aAux = activiteRepository.findOne(l1);
        Utilisateur uAux = utilisateurRepository.findOne(l2);
        inscriptionRepository.save(new Inscription(uAux, aAux));
    }

    public void deleteInscription(Long l1) {
        inscriptionRepository.delete(l1);
    }

}
