package projet2.demo.dao;

import projet2.demo.entity.Photo;

public interface PhotoDao {
    Photo findById(long PhotoID)  throws Exception;
    Photo save (Photo photo)  throws Exception;
//
//    Photo update(Photo photo) throws Exception ;
//    void deleteById(long photoID)  throws Exception;

    Iterable<Photo> findAll();


    Iterable<Photo> findByIdUser(long IdUser)throws Exception;
//    Iterable<Photo> getAllById_userIs(long IdUser)throws Exception;
}
