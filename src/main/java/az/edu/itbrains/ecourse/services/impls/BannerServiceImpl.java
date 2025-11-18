package az.edu.itbrains.ecourse.services.impls;

import az.edu.itbrains.ecourse.dtos.banner.BannerHomeDto;
import az.edu.itbrains.ecourse.models.Banner;
import az.edu.itbrains.ecourse.models.languages.BannerLanguage;
import az.edu.itbrains.ecourse.repositories.BannerRepository;
import az.edu.itbrains.ecourse.services.BannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BannerServiceImpl implements BannerService {

    private final BannerRepository bannerRepository;


    @Override
    public BannerHomeDto getHomeBanner(String langCode) {
        Banner banner = bannerRepository.findAll().get(0);
        BannerLanguage bannerLanguage = banner.getBannerLanguages().stream().filter(bl -> bl.getLangCode().equals(langCode)).findFirst().orElse(null);
        BannerHomeDto bannerHomeDto =
                BannerHomeDto.builder()
                        .id(banner.getId())
                        .title(bannerLanguage.getTitle())
                        .subtitle(bannerLanguage.getSubtitle())
                        .photoUrl(banner.getPhotoUrl())
                        .build();
        return bannerHomeDto;
    }
}
