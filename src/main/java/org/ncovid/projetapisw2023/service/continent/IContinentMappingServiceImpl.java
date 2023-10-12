package org.ncovid.projetapisw2023.service.continent;

import lombok.AllArgsConstructor;
import org.ncovid.projetapisw2023.model.ContinentMapping;
import org.ncovid.projetapisw2023.repository.ContinentMappingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class IContinentMappingServiceImpl implements IContinentMappingService{

    private final ContinentMappingRepository continentMappingRepository;

    @Override
    public ContinentMapping createContinentMapping(ContinentMapping continentMapping) {
        return continentMappingRepository.save(continentMapping);
    }


    @Override
    public List<ContinentMapping> readContinentMapping() {
        return continentMappingRepository.findAll();
    }


    @Override
    public ContinentMapping updateContinentMapping(Long id, ContinentMapping continentMapping) {
        return continentMappingRepository.findById(id)
                .map(c ->{
                    c.setPays(continentMapping.getPays());
                    c.setContinent(continentMapping.getContinent());

                    return continentMappingRepository.save(c);
                }).orElseThrow(()->new RuntimeException("Updated Continent Mapping"));
    }

    @Override
    public String deleteContinentMapping(Long id) {

        continentMappingRepository.deleteById(id);
        return "Deleted Continent Mapping";
    }

    @Override
    public List<Map<String, Object>> getInfoDecesParContinent() {
        return continentMappingRepository.getInfoDecesParContinent();
    }

    @Override
    public List<Map<String, Object>> getInfoConfirmeParContinent() {
        return continentMappingRepository.getInfoConfirmeParContinent();
    }
}
