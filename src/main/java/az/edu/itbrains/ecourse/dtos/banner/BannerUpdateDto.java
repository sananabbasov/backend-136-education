package az.edu.itbrains.ecourse.dtos.banner;


import az.edu.itbrains.ecourse.dtos.banner.bannerLanguage.BannerLanguageCreateDto;
import az.edu.itbrains.ecourse.dtos.banner.bannerLanguage.BannerLanguageUpdateDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BannerUpdateDto {
    private String photoUrl;
    private List<BannerLanguageUpdateDto> bannerLanguages;
}
