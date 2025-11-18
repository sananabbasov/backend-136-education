package az.edu.itbrains.ecourse.models.languages;

import az.edu.itbrains.ecourse.models.Banner;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class BannerLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String subtitle;
    private String langCode;


    @ManyToOne
    private Banner banner;
}
