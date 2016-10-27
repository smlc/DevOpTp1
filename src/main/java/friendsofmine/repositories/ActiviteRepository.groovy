package friendsofmine.repositories

import friendsofmine.Activite
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

/**
 * Created by walid on 26/10/2016.
 */
@Repository
interface ActiviteRepository extends PagingAndSortingRepository {

    // void save(Activite activite);

}