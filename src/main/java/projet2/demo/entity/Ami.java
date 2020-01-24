package projet2.demo.entity;

import javax.persistence.*;

@Entity
public class Ami {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column( nullable = false)
    private long id_user1;
    @Column( nullable = false)
    private long id_user2;


    public Ami(){}

    public Ami(long id_user1, long id_user2) {
        this.id_user1 = id_user1;
        this.id_user2 = id_user2;
    }

    public Ami(long id,long id_user1, long id_user2) {
        this(id_user1,id_user2);
        this.id=id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_user1() {
        return id_user1;
    }

    public void setId_user1(long id_user1) {
        this.id_user1 = id_user1;
    }

    public long getId_user2() {
        return id_user2;
    }

    public void setId_user2(long id_user2) {
        this.id_user2 = id_user2;
    }
}
