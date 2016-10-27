package friendsofmine

import friendsofmine.repositories.ActiviteRepository
import org.springframework.data.repository.PagingAndSortingRepository
import spock.lang.Specification

/**
 * Created by walid on 26/10/2016.
 */
class ActiviteServiceTest extends Specification {

    ActiviteService activiteService
    ActiviteRepository activiteRepository

    void setup() {
        activiteRepository = Mock()
        activiteService = new ActiviteService()
        activiteService.activiteRepository = activiteRepository
    }

    def "check type of activiteRepository"() {
        expect: "activiteRepository is a Spring repository"
        activiteRepository instanceof PagingAndSortingRepository
    }

    def "test delegation of save of an Activite to the repository"() {
        given: "an activite"
        def activite = Mock(Activite)

        when: "the activite is saved"
        activiteService.saveActivite(activite);

        then: "the save is delegated to the activiteRepository"
        1 * activiteRepository.save(activite)
    }
}