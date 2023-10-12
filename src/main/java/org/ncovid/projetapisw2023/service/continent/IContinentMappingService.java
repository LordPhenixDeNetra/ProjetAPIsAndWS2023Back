package org.ncovid.projetapisw2023.service.continent;

import org.ncovid.projetapisw2023.model.ContinentMapping;

import java.util.List;
import java.util.Map;

public interface IContinentMappingService {

    public ContinentMapping createContinentMapping(ContinentMapping continentMapping);

    public List<ContinentMapping> readContinentMapping();

    public ContinentMapping updateContinentMapping(Long id, ContinentMapping continentMapping);

    public String deleteContinentMapping(Long id);

    public List<Map<String, Object>> getInfoDecesParContinent();

    public List<Map<String, Object>> getInfoConfirmeParContinent();
}
