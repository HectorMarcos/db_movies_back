package db_movies.db_movies.stars;

import javax.persistence.*;

@Entity
@Table(name = "STARS")
public class Star {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "ABOUT")
    private String about;

    public Star() {
    }

    public Star(String name, String about) {
        this.name = name;
        this.about = about;
    }

    public Star(Long id, String name, String about) {
        this.id = id;
        this.name = name;
        this.about = about;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}

