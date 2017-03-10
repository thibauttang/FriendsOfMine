package friendsofmine.repositories;

import friendsofmine.domain.Utilisateur;
import org.springframework.data.repository.PagingAndSortingRepository;


/**
 * Created by thibauttang on 10/03/2017.
 */

public interface UtilisateurRepository extends PagingAndSortingRepository<Utilisateur, Long> {



}
