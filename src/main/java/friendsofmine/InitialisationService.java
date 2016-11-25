package friendsofmine;

import friendsofmine.repositories.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by walid on 04/11/2016.
 */

@Service
@Transactional
public class InitialisationService {

    private Utilisateur mary = new Utilisateur("Mary", "Mary", "mary@test.fr", "F", new Date());
    private Utilisateur thom = new Utilisateur("Thom", "Thom", "thom@test.fr", "M", new Date());

    private Activite lindyHop = new Activite("lindyHop", "Cool", mary);
    private Activite randonnee = new Activite("randonnee", "Cool", mary);
    private Activite taekwondo = new Activite("taekwondo", "Cool", thom);

    private Inscription maryOnTaekwondo = new Inscription(mary, taekwondo);
    private Inscription thomOnLindyhop = new Inscription(thom, lindyHop);
    private Inscription thomOnRandonnee = new Inscription(thom, randonnee);

    @Autowired
    ActiviteService activiteService;

    @Autowired
    InscriptionRepository inscriptionRepository;

    @Autowired
    Bootstrap bootstrap;

    public void initActivites() throws RuntimeException {
        activiteService.saveActivite(lindyHop);
        activiteService.saveActivite(randonnee);
        activiteService.saveActivite(taekwondo);
    }

    public void initInscriptions() throws RuntimeException {
        inscriptionRepository.save(maryOnTaekwondo);
        inscriptionRepository.save(thomOnLindyhop);
        inscriptionRepository.save(thomOnRandonnee);
    }

    public Utilisateur getMary() {
        return mary;
    }

    public Utilisateur getThom() {
        return thom;
    }

    public Activite getLindyHop() {
        return lindyHop;
    }

    public Activite getRandonnee() {
        return randonnee;
    }

    public Activite getTaekwondo() {
        return taekwondo;
    }

    public Inscription getMaryOnTaekwondo() {
        return maryOnTaekwondo;
    }

    public void setMaryOnTaekwondo(Inscription maryOnTaekwondo) {
        this.maryOnTaekwondo = maryOnTaekwondo;
    }

    public Inscription getThomOnLindyhop() {
        return thomOnLindyhop;
    }

    public void setThomOnLindyhop(Inscription thomOnLindyhop) {
        this.thomOnLindyhop = thomOnLindyhop;
    }

    public Inscription getThomOnRandonnee() {
        return thomOnRandonnee;
    }

    public void setThomOnRandonnee(Inscription thomOnRandonnee) {
        this.thomOnRandonnee = thomOnRandonnee;
    }

}
