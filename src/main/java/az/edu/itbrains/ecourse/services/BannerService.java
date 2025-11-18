package az.edu.itbrains.ecourse.services;

import az.edu.itbrains.ecourse.dtos.banner.BannerHomeDto;

public interface BannerService {
    BannerHomeDto getHomeBanner(String langCode);
}
