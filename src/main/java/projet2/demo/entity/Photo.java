package projet2.demo.entity;

import javax.persistence.*;

@Entity
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column( nullable = false)
    private long idUser;
    @Column
    private String src;
    @Column
    private String alt;
    @Column
    private String type;
    @Column( nullable = false)
    private String date_publication;


    public Photo(){}

    public Photo(long id_user, String src, String alt, String type, String date_publication) {
        this.idUser = id_user;
        this.src = src;
        this.alt = alt;
        this.type = type;
        this.date_publication = date_publication;
    }

    public Photo(long id,long id_user, String src, String alt, String type, String date_publication) {
        this(  id_user,   src,   alt,   type,   date_publication);
        this.id=id;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", id_user=" + idUser +
                ", src='" + src + '\'' +
                ", alt='" + alt + '\'' +
                ", type='" + type + '\'' +
                ", date_publication='" + date_publication + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long id_user) {
        this.idUser = id_user;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate_publication() {
        return date_publication;
    }

    public void setDate_publication(String date_publication) {
        this.date_publication = date_publication;
    }
}