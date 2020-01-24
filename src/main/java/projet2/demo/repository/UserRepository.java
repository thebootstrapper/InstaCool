package projet2.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import projet2.demo.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findUserByEmail(String email);
    User findUserById(long userId);
    User save (User user);
    Iterable<User> findAll();
/*
    @Query(value = "select * from user u where u.nom like '%pa%' or u.prenom like '%pa%'",nativeQuery = true)
    Iterable<User> recherche(String mot);

    */

    @Query(value = "select * from user where nom like %:mot% or prenom like %:mot% ",nativeQuery = true)
    Iterable<User> recherche(  @Param("mot") String mot);


    User findByEmailAndPassword( String email, String password);
}
