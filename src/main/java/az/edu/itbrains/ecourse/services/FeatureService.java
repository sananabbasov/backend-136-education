package az.edu.itbrains.ecourse.services;

import az.edu.itbrains.ecourse.dtos.feature.FeatureHomeDto;

import java.util.List;

public interface FeatureService {

    List<FeatureHomeDto> getHomeFeature(String lang);
}
