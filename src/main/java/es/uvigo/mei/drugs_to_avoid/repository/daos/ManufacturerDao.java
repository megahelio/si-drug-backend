package es.uvigo.mei.drugs_to_avoid.repository.daos;

import es.uvigo.mei.drugs_to_avoid.repository.entidades.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ManufacturerDao extends JpaRepository<Manufacturer, String> {
    Optional<Manufacturer> findByCif(String cif);
    List<Manufacturer> findByNameContaining(String name);
}
