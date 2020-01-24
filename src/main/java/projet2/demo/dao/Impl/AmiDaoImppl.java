package projet2.demo.dao.Impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projet2.demo.dao.AmiDao;
import projet2.demo.entity.Ami;
import projet2.demo.repository.AmiRepository;


@Service
@Transactional
public class AmiDaoImppl implements AmiDao {

    private AmiRepository amiRepository;
    @Override
    public Ami save(Ami ami) {
        return (Ami)amiRepository.save(ami);
    }
}
