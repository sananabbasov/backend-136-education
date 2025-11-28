package az.edu.itbrains.ecourse.services.impls;

import az.edu.itbrains.ecourse.dtos.banner.bannerLanguage.BannerLanguageCreateDto;
import az.edu.itbrains.ecourse.dtos.banner.bannerLanguage.BannerLanguageUpdateDto;
import az.edu.itbrains.ecourse.exceptions.ResourceNotFoundException;
import az.edu.itbrains.ecourse.models.Banner;
import az.edu.itbrains.ecourse.models.languages.BannerLanguage;
import az.edu.itbrains.ecourse.repositories.BannerLanguageRepository;
import az.edu.itbrains.ecourse.repositories.BannerRepository;
import az.edu.itbrains.ecourse.services.BannerLanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BannerLanguageServiceImpl implements BannerLanguageService {

    private final BannerLanguageRepository bannerLanguageRepository;

    @Override
    public void updateBannerLanguage(List<BannerLanguageUpdateDto> bannerLanguages) {

      try {
          for (BannerLanguageUpdateDto bannerLanguage : bannerLanguages) {
              BannerLanguage findById = bannerLanguageRepository.findById(bannerLanguage.getId()).orElseThrow(() -> new ResourceNotFoundException("Banner","id", bannerLanguage.getId()));;
              findById.setTitle(bannerLanguage.getTitle());
              findById.setSubtitle(bannerLanguage.getSubtitle());
              bannerLanguageRepository.save(findById);
          }
      }catch (Exception e){
          System.out.println(e.getMessage());
      }

    }

    @Override
    public void saveBannerLanguage(List<BannerLanguageCreateDto> bannerLanguages, Banner banner) {
        try {
            int count = 0;
            for (BannerLanguageCreateDto bl : bannerLanguages) {
                String langCode = count == 0 ? "az" : "en";
                BannerLanguage bannerLanguage = new BannerLanguage();
                bannerLanguage.setLangCode(langCode);
                bannerLanguage.setSubtitle(bl.getSubtitle());
                bannerLanguage.setTitle(bl.getTitle());
                bannerLanguage.setBanner(banner);
                bannerLanguageRepository.save(bannerLanguage);
                count++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
