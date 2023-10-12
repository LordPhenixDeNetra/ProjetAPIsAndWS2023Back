package org.ncovid.projetapisw2023.repository;

import org.ncovid.projetapisw2023.model.ContinentMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface ContinentMappingRepository extends JpaRepository<ContinentMapping, Long> {

    @Query(value = "SELECT continent, SUM(confirme) AS totalConfirme FROM continent_mapping JOIN country_values ON continent_mapping.pays = country_values.pays GROUP BY continent", nativeQuery = true)
    List<Map<String, Object>> getInfoConfirmeParContinent();

    @Query(value = "SELECT continent, SUM(deces) AS totalDeces FROM continent_mapping JOIN country_values ON continent_mapping.pays = country_values.pays GROUP BY continent", nativeQuery = true)
    List<Map<String, Object>> getInfoDecesParContinent();
}
