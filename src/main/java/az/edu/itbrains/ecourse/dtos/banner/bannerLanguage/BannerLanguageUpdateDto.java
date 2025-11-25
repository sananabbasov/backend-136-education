package az.edu.itbrains.ecourse.dtos.banner.bannerLanguage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BannerLanguageUpdateDto {
    private String title;
    private String subtitle;
    private String langCode;
}
