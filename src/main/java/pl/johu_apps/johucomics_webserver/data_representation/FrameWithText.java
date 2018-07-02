package pl.johu_apps.johucomics_webserver.data_representation;

import javax.persistence.*;

@Entity
public class FrameWithText {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Frame frame;
    private String text;

    public FrameWithText(){

    }

    public FrameWithText(Frame frame, String text) {
        this.frame = frame;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Frame getFrame() {
        return frame;
    }
}
