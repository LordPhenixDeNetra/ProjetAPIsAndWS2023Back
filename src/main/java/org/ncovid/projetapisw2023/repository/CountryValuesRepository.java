package org.ncovid.projetapisw2023.repository;

import org.ncovid.projetapisw2023.model.CountryValues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface CountryValuesRepository extends JpaRepository<CountryValues, Long> {

    @Query(value = "SELECT SUM(confirme) FROM country_values", nativeQuery = true)
    Long sumConfirm();

    @Query(value = "SELECT SUM(deces) FROM country_values", nativeQuery = true)
    Long sumDeces();
}
