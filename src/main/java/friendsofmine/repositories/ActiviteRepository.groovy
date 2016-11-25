package friendsofmine.repositories

import friendsofmine.Activite
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

/**
 * Created by mars on 26/10/16.
 */

@Repository
interface ActiviteRepository extends PagingAndSortingRepository<Activite,Long> {
  @Query("select activite from Activite activite join fetch activite.responsable order by activite.titre asc")
    List<Activite> findAll();
}
