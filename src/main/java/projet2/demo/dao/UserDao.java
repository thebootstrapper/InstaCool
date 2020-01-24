package projet2.demo.dao;

import projet2.demo.entity.User;

public interface UserDao {

    User save(User user) throws Exception ;
    User findUserById(long userId) throws Exception;
    User findUserByEmail(String email)  throws Exception;
    User update(User user) throws Exception ;
    void deleteById(long userId)  throws Exception;

    Iterable<User> findAll();
    Iterable<User> recherche(String mot);


    User findByEmailAndPassword( String email, String password);

}
