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


}
