package az.edu.itbrains.ecourse.models;

import az.edu.itbrains.ecourse.models.languages.AboutLanguage;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
public class About {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String photoUrl;



    @OneToMany(mappedBy = "about")
    private List<AboutLanguage> aboutLanguages;
}
