package friendsofmine.repositories

import friendsofmine.Utilisateur
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

/**
 * Created by mars on 26/10/16.
 */
@Repository
interface UtilisateurRepository extends PagingAndSortingRepository<Utilisateur,Long> {
}
