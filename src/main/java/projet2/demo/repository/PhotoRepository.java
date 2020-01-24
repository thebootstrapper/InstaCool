package projet2.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import projet2.demo.entity.Photo;

import java.util.Collection;

@Repository
public interface PhotoRepository extends CrudRepository<Photo, Long> {

    Photo findById(long PhotoID);
    Photo save (Photo user);
//    Iterable<Photo> findAllById_userIs(long IdUser);

    Iterable<Photo> findAll();
//    Iterable<Photo> selectWhereIdUserIs(long);
    Iterable<Photo> findByIdUser(long idUser);


}