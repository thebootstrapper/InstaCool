package projet2.demo.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projet2.demo.dao.UserDao;
import projet2.demo.entity.User;
import projet2.demo.repository.UserRepository;


@Service
@Transactional
public class UserDaoImpl  implements UserDao {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) throws Exception {
        return (User)userRepository.save(user);
    }

    @Override
    public User update(User user) throws Exception {
        return this.save(user);
    }

    @Override
    public User findUserById(long userId) throws Exception{
        return (User)userRepository.findUserById(userId);
    }

    @Override
    public void deleteById(long userId) throws Exception {
        userRepository.deleteById(userId);
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Iterable<User> recherche(String mot) {
        return userRepository.recherche(mot);
    }


    @Override
    public User findUserByEmail(String email) throws Exception {
        return (User)userRepository.findUserByEmail(email);
    }

    @Override
    public User findByEmailAndPassword(String email, String password) {
        return (User)userRepository.findByEmailAndPassword(email,password);
    }

}
