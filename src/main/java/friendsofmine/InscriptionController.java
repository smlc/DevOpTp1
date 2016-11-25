package friendsofmine;

import friendsofmine.repositories.ActiviteRepository;
import friendsofmine.repositories.InscriptionRepository;
import friendsofmine.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by walid on 25/11/2016.
 */

@RestController
public class InscriptionController {

    @Autowired
    InscriptionRepository inscriptionRepository;

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Autowired
    ActiviteRepository activiteRepository;

    @RequestMapping(value="/api/v1/inscriptions", method= RequestMethod.POST)
    public Inscription addInscription(@RequestParam(value = "activite_id") Long l1, @RequestParam(value = "utilisateur_id") Long l2) {
        Activite aAux = activiteRepository.findOne(l1);
        Utilisateur uAux = utilisateurRepository.findOne(l2);
        return (inscriptionRepository.save(new Inscription(uAux, aAux)));
    }

    @RequestMapping(value="/api/v1/inscriptions/{id}", method= RequestMethod.DELETE)
    public void deleteInscription(@PathVariable("id") Long l1) {
        inscriptionRepository.delete(l1);
    }

}
