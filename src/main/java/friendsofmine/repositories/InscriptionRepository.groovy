package friendsofmine.repositories

import friendsofmine.Inscription
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

/**
 * Created by alpha on 25/11/2016.
 */
@Repository
interface InscriptionRepository extends PagingAndSortingRepository<Inscription,Long> {
    Inscription save(Inscription uneInscription);
    Inscription findOne(Long id);
}