package friendsofmine;

import friendsofmine.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mars on 26/10/16.
 */

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    void saveUtilisateur (Utilisateur utilisateur) {
        this.utilisateurRepository.save(utilisateur);
    }

}
