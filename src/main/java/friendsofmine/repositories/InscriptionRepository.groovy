package friendsofmine.repositories

import friendsofmine.Inscription
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

/**
 * Created by walid on 25/11/2016.
 */

@Repository
public interface InscriptionRepository extends PagingAndSortingRepository<Inscription, Long> {
}
