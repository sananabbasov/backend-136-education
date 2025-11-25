package az.edu.itbrains.ecourse.dtos.banner;


import az.edu.itbrains.ecourse.dtos.banner.bannerLanguage.BannerLanguageCreateDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BannerCreateDto {
    private String photoUrl;
    private List<BannerLanguageCreateDto> bannerLanguages;
}
