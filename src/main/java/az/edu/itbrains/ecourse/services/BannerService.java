package az.edu.itbrains.ecourse.services;

import az.edu.itbrains.ecourse.dtos.banner.BannerHomeDto;
import az.edu.itbrains.ecourse.dtos.banner.BannerUpdateDto;

public interface BannerService {
    BannerHomeDto getHomeBanner(String langCode);

    BannerUpdateDto getUpdatedBanner(Long id);
}
