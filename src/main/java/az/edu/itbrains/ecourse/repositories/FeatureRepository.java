package az.edu.itbrains.ecourse.repositories;

import az.edu.itbrains.ecourse.dtos.feature.FeatureHomeDto;
import az.edu.itbrains.ecourse.models.Feature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FeatureRepository extends JpaRepository<Feature, Long> {

}
