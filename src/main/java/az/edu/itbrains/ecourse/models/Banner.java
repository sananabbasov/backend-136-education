package az.edu.itbrains.ecourse.models;

import az.edu.itbrains.ecourse.models.languages.BannerLanguage;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String photoUrl;

    @OneToMany(mappedBy = "banner")
    private List<BannerLanguage> bannerLanguages;
}
