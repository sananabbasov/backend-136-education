package az.edu.itbrains.ecourse.models;

import az.edu.itbrains.ecourse.models.languages.CourseLanguage;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String photoUrl;
    private Double price;

    @OneToMany(mappedBy = "course")
    private List<CourseLanguage> courseLanguages;
}
