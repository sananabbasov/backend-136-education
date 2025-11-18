package az.edu.itbrains.ecourse.repositories;

import az.edu.itbrains.ecourse.models.languages.BannerLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BannerLanguageRepository extends JpaRepository<BannerLanguage, Long> {
}
