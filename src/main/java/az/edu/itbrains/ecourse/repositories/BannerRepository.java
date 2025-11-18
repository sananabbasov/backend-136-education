package az.edu.itbrains.ecourse.repositories;

import az.edu.itbrains.ecourse.models.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BannerRepository extends JpaRepository<Banner, Long> {
}
