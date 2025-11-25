package az.edu.itbrains.ecourse.services.impls;

import az.edu.itbrains.ecourse.dtos.feature.FeatureHomeDto;
import az.edu.itbrains.ecourse.repositories.FeatureLanguageRepository;
import az.edu.itbrains.ecourse.services.FeatureLanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FeatureLanguageServiceImpl implements FeatureLanguageService {
    private final FeatureLanguageRepository featureLanguageRepository;

    @Override
    public List<FeatureHomeDto> getHomeFeature(String lang) {
        List<FeatureHomeDto> featureHomeDtoList = featureLanguageRepository.getHomeFeature(lang);
        if (featureHomeDtoList != null && !featureHomeDtoList.isEmpty()) {
            return featureHomeDtoList;
        }
        return List.of();
    }
}
