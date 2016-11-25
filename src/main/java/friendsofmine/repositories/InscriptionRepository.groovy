package friendsofmine.repositories

import friendsofmine.Inscription
import org.springframework.data.repository.PagingAndSortingRepository

/**
 * Created by alpha on 25/11/2016.
 */
interface InscriptionRepository extends PagingAndSortingRepository<Inscription,Long> {

}