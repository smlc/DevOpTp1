package friendsofmine;

import friendsofmine.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by walid on 26/10/2016.
 */
@Service
public class UtilisateurService {

    @Autowired
    UtilisateurRepository utilisateurRepository;

    void saveUtilisateur (Utilisateur u) {
        this.utilisateurRepository.save(u);
    }

}
