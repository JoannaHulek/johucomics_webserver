package pl.johu_apps.johucomics_webserver.data_representation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Frame {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String imgURL;

    public Frame() {
    }

    public Frame(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getImgURL() {
        return imgURL;
    }
}
