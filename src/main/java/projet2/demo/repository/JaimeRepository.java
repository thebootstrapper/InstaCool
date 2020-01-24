package projet2.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import projet2.demo.entity.Jaime;


@Repository
public interface JaimeRepository extends CrudRepository<Jaime, Long> {
}

