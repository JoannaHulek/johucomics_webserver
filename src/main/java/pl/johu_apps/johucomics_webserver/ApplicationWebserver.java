package pl.johu_apps.johucomics_webserver;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.johu_apps.johucomics_webserver.data_representation.Comic;
import pl.johu_apps.johucomics_webserver.data_representation.Frame;
import pl.johu_apps.johucomics_webserver.repositories.ComicRepository;
import pl.johu_apps.johucomics_webserver.repositories.FrameRepository;

import java.time.LocalDate;
import java.util.Collections;

@SpringBootApplication
public class ApplicationWebserver {
    @Autowired
    private ComicRepository comicRepository;
    @Autowired
    private FrameRepository frameRepository;

    public static void main(String[] args) {
        SpringApplication.run(ApplicationWebserver.class, args);
    }

    @Bean
    public InitializingBean initializingBean() {
        return () -> {
            Frame frame = new Frame("https://vgarmada.files.wordpress.com/2011/08/dilbert.jpg");
            frameRepository.save(frame);
            comicRepository.save(new Comic("test",
                    "Joasienka",
                    "https://vgarmada.files.wordpress.com/2011/08/dilbert.jpg",
                    LocalDate.now(),
                    Collections.singletonList(frame)));
        };
    }
}
