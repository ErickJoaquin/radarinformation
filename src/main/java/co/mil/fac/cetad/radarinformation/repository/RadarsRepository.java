package co.mil.fac.cetad.radarinformation.repository;

import co.mil.fac.cetad.radarinformation.model.HRadares;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RadarsRepository extends JpaRepository<HRadares, Integer> {
}
