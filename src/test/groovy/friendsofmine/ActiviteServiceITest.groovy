package friendsofmine

import friendsofmine.repositories.ActiviteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

import javax.validation.ConstraintViolationException

/**
<<<<<<< HEAD
 * Created by walid on 26/10/2016.
=======
<<<<<<< HEAD
 * Created by franck on 18/10/2016.
=======
 * Created by walid on 26/10/2016.
>>>>>>> 7b4bd7d09c5992851e01b2e8d1442bfffb16ce85
>>>>>>> d057dd19572808bbf819430d1f563d131233365a
 */
@ContextConfiguration
@SpringBootTest
class ActiviteServiceITest extends Specification {

    @Autowired ActiviteService activiteService

    def "test save a valid activite"() {
        given: "a valid activite"
        Activite natation = new Activite(titre: "natation")

        when: "the activite is saved"
        activiteService.saveActivite(natation);

        then: "the activite has an id"
        natation.id != null

    }

    def "test save a non valid activite"() {
        given: "a non valid activite"
        Activite natation = new Activite()

        when: "the activite is saved"
        activiteService.saveActivite(natation);

        then: "A validation exception is thrown"
        thrown ConstraintViolationException

        and: "activite has still null id"
        natation.id == null
    }
}