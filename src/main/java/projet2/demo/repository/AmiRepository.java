package projet2.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import projet2.demo.entity.Ami;

@Repository
public interface AmiRepository extends CrudRepository<Ami, Long> {
    Ami save (Ami ami);
}
