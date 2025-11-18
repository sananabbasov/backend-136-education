package az.edu.itbrains.ecourse.dtos.banner;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BannerHomeDto {
    public Long id;
    public String title;
    public String subtitle;
    public String photoUrl;
    public String langCode;
}
