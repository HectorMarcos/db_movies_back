package db_movies.db_movies.movie;

import javax.persistence.*;


@Entity
@Table(name = "MOVIES")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "YEAR")
    private int year;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "certificate")
    private String certificate;
    @Column(name = "runtime")
    private int runtime;
    @Column(name = "imdb_rating")
    private Float imdbRating;
    @Column(name = "metascore")
    private int metaScore;
    @Column(name = "votes")
    private int votes;
    @Column(name = "gross")
    private int gross;

    public Movie() {
    }

    public Movie(String title, int year, String imageUrl, String certificate, int runtime, Float imdbRating, int metaScore, int votes, int gross) {
        this.title = title;
        this.year = year;
        this.imageUrl = imageUrl;
        this.certificate = certificate;
        this.runtime = runtime;
        this.imdbRating = imdbRating;
        this.metaScore = metaScore;
        this.votes = votes;
        this.gross = gross;
    }

    public Movie(Long id, String title, int year, String imageUrl, String certificate, int runtime, Float imdbRating, int metaScore, int votes, int gross) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.imageUrl = imageUrl;
        this.certificate = certificate;
        this.runtime = runtime;
        this.imdbRating = imdbRating;
        this.metaScore = metaScore;
        this.votes = votes;
        this.gross = gross;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public Float getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(Float imdbRating) {
        this.imdbRating = imdbRating;
    }

    public int getMetaScore() {
        return metaScore;
    }

    public void setMetaScore(int metaScore) {
        this.metaScore = metaScore;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public int getGross() {
        return gross;
    }

    public void setGross(int gross) {
        this.gross = gross;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", imageUrl='" + imageUrl + '\'' +
                ", certificate='" + certificate + '\'' +
                ", runtime=" + runtime +
                ", imdbRating=" + imdbRating +
                ", metaScore=" + metaScore +
                ", votes=" + votes +
                ", gross=" + gross +
                '}';
    }
}
