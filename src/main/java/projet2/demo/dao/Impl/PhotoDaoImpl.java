package projet2.demo.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projet2.demo.dao.PhotoDao;
import projet2.demo.entity.Photo;
import projet2.demo.repository.PhotoRepository;

@Service
@Transactional
public class PhotoDaoImpl implements PhotoDao {

    @Autowired
    private PhotoRepository photoRepository;


    @Override
    public Photo findById(long PhotoID)  throws Exception{
        return (Photo)photoRepository.findById(PhotoID);
    }

    @Override
    public Photo save(Photo photo)  throws Exception{
        return (Photo)photoRepository.save(photo);
    }

/*
    @Override
    public Photo update(Photo photo) throws Exception {
        return this.save(photo);
    }

    @Override
    public void deleteById(long photoID) throws Exception {
        photoRepository.deleteById(photoID);

    }*/

    @Override
    public Iterable<Photo> findAll() {
        return photoRepository.findAll();
    }

    @Override
    public Iterable<Photo> findByIdUser(long IdUser) throws Exception {
        return photoRepository.findByIdUser(IdUser);
    }

//    @Override
//    public Iterable<Photo> findAllById_user(long IdUser) throws Exception {
//        return  photoRepository.findAllById_user( IdUser);
//    }

//    @Override
//    public Iterable<Photo> getAllById_userIs(long IdUser) throws Exception {
//        return  photoRepository.getAllById_userIs( IdUser);
//    }

}
