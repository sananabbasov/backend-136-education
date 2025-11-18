package az.edu.itbrains.ecourse.models;

import az.edu.itbrains.ecourse.models.languages.FeatureLanguage;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Feature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String icon;

    @OneToMany(mappedBy = "feature")
    private List<FeatureLanguage> featureLanguages;
}
