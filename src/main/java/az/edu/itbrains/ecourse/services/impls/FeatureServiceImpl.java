package az.edu.itbrains.ecourse.services.impls;

import az.edu.itbrains.ecourse.dtos.feature.FeatureHomeDto;
import az.edu.itbrains.ecourse.repositories.FeatureRepository;
import az.edu.itbrains.ecourse.services.FeatureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class FeatureServiceImpl implements FeatureService {
    private final FeatureRepository featureRepository;


    @Override
    public List<FeatureHomeDto> getHomeFeature(String lang) {

        return List.of();
    }
}
