package az.edu.itbrains.ecourse.dtos.feature;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FeatureHomeDto {
    private Long id;
    private String title;
    private String text;
    private String icon;
    private String langCode;



}
