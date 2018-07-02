package pl.johu_apps.johucomics_webserver.data_representation;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Comic {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String author;
    private String logoImgURL;
    private LocalDate publicationDate;

    @OneToMany
    private List<Frame> frames;

    public Comic() {
    }

    public Comic(String title, String author, String logoImgURL, LocalDate publicationDate, List<Frame> frames) {
        this.title = title;
        this.author = author;
        this.logoImgURL = logoImgURL;
        this.publicationDate = publicationDate;
        this.frames = frames;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getLogoImgURL() {
        return logoImgURL;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public List<Frame> getFrames() {
        return frames;
    }
}
