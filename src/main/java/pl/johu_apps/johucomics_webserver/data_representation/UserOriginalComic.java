package pl.johu_apps.johucomics_webserver.data_representation;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserOriginalComic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Comic comic;

    @OneToMany
    private List<FrameWithText> framesWithText;

    public UserOriginalComic(Comic comic, List<FrameWithText> framesWithText) {
        this.comic = comic;
        this.framesWithText = framesWithText;
    }


    public Comic getComic() {
        return comic;
    }

    public List<FrameWithText> getFramesWithText() {
        return framesWithText;
    }
}
