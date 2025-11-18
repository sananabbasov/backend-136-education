package az.edu.itbrains.ecourse.models.languages;

import az.edu.itbrains.ecourse.models.Course;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CourseLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String text;
    private String langCode;

    @ManyToOne
    private Course course;
}
