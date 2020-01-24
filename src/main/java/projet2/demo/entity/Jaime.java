package projet2.demo.entity;

import javax.persistence.*;

@Entity
public class Jaime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column( nullable = false)
    private long id_photo;
    @Column( nullable = false)
    private long id_user;


    public Jaime(){}

    public Jaime(long id_photo, long id_user) {
        this.id_photo = id_photo;
        this.id_user = id_user;
    }
    public Jaime(long id,long id_photo, long id_user) {
        this(id_photo,  id_user);
        this.id=id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_photo() {
        return id_photo;
    }

    public void setId_photo(long id_photo) {
        this.id_photo = id_photo;
    }

    public long getId_user() {
        return id_user;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }
}
