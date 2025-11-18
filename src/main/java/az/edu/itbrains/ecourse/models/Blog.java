package az.edu.itbrains.ecourse.models;

import az.edu.itbrains.ecourse.models.languages.BlogLanguage;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String photoUrl;
    private Date createDate;
    private int views;

    @OneToMany(mappedBy = "blog")
    private List<BlogLanguage> blogLanguages;
}
