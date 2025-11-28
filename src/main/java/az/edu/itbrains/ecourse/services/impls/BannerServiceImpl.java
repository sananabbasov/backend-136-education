package az.edu.itbrains.ecourse.services.impls;

import az.edu.itbrains.ecourse.dtos.banner.BannerCreateDto;
import az.edu.itbrains.ecourse.dtos.banner.BannerHomeDto;
import az.edu.itbrains.ecourse.dtos.banner.BannerUpdateDto;
import az.edu.itbrains.ecourse.dtos.banner.bannerLanguage.BannerLanguageUpdateDto;
import az.edu.itbrains.ecourse.exceptions.ResourceNotFoundException;
import az.edu.itbrains.ecourse.models.Banner;
import az.edu.itbrains.ecourse.models.languages.BannerLanguage;
import az.edu.itbrains.ecourse.repositories.BannerRepository;
import az.edu.itbrains.ecourse.services.BannerLanguageService;
import az.edu.itbrains.ecourse.services.BannerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BannerServiceImpl implements BannerService {

    private final BannerRepository bannerRepository;
    private final BannerLanguageService bannerLanguageService;
    private final ModelMapper modelMapper;


    @Override
    public BannerHomeDto getHomeBanner(String langCode) {
     try {
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
     }catch (Exception e){
         return new BannerHomeDto();
     }
    }

    @Override
    public BannerUpdateDto getUpdatedBanner(Long id) {
        Banner banner = bannerRepository.findById(id).orElse(null);
        BannerUpdateDto bannerUpdateDto = modelMapper.map(banner, BannerUpdateDto.class);
        return bannerUpdateDto;
    }

    @Override
    public boolean updateBanner(Long id, BannerUpdateDto bannerUpdateDto) {
        try {
            Banner banner = bannerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Banner","id", id));
            List<BannerLanguage> bannerLanguages = banner.getBannerLanguages();
            bannerLanguages.clear();
            bannerLanguageService.updateBannerLanguage(bannerUpdateDto.getBannerLanguages());
            bannerRepository.save(banner);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean createBanner(BannerCreateDto bannerCreateDto) {
        try {
            List<Banner> findBanner = bannerRepository.findAll();
            if (!findBanner.isEmpty() || findBanner != null) return false;
            Banner banner = new Banner();
            banner.setPhotoUrl(bannerCreateDto.getPhotoUrl());
            bannerRepository.save(banner);
            bannerLanguageService.saveBannerLanguage(bannerCreateDto.getBannerLanguages(), banner);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
