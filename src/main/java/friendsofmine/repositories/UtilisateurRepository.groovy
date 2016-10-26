package friendsofmine.repositories

import friendsofmine.Utilisateur
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

/**
 * Created by walid on 26/10/2016.
 */
@Repository
interface UtilisateurRepository extends PagingAndSortingRepository {

    void save(Utilisateur utilisateur);

}