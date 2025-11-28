package az.edu.itbrains.ecourse.services;

import az.edu.itbrains.ecourse.dtos.banner.bannerLanguage.BannerLanguageCreateDto;
import az.edu.itbrains.ecourse.dtos.banner.bannerLanguage.BannerLanguageUpdateDto;
import az.edu.itbrains.ecourse.models.Banner;

import java.util.List;

public interface BannerLanguageService {
    void updateBannerLanguage(List<BannerLanguageUpdateDto> bannerLanguages);

    void saveBannerLanguage(List<BannerLanguageCreateDto> bannerLanguages, Banner banner);
}
