package ecolededev.pe.rome;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by grenouille on 18/06/2017.
 */
@Repository
public interface RomeRepository extends JpaRepository<Rome, Long>
{
        Rome findOneByCode(String code);
}
