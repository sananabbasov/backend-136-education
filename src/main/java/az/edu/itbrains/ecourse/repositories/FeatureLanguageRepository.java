package az.edu.itbrains.ecourse.repositories;

import az.edu.itbrains.ecourse.dtos.feature.FeatureHomeDto;
import az.edu.itbrains.ecourse.models.languages.FeatureLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FeatureLanguageRepository extends JpaRepository<FeatureLanguage, Long> {
    @Query("select new az.edu.itbrains.ecourse.dtos.feature.FeatureHomeDto(f.feature.id, f.title, f.text, f.feature.icon, f.langCode) from FeatureLanguage f where f.langCode=:lang")
    List<FeatureHomeDto> getHomeFeature(String lang);
}
