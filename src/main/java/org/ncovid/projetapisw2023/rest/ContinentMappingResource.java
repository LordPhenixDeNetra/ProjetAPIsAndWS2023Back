package org.ncovid.projetapisw2023.rest;

import lombok.AllArgsConstructor;
import org.ncovid.projetapisw2023.model.ContinentMapping;
import org.ncovid.projetapisw2023.service.continent.IContinentMappingServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/continent-mapping")
public class ContinentMappingResource {
    
    private final IContinentMappingServiceImpl continentMappingService;

    @PostMapping("/create")
    public ContinentMapping createContinentMapping(ContinentMapping ContinentMapping){
        return continentMappingService.createContinentMapping(ContinentMapping);
    }

    @GetMapping
    public List<ContinentMapping> readContinentMapping(){
        return continentMappingService.readContinentMapping();
    }

    @PutMapping("/update/{id}")
    public ContinentMapping updateContinentMapping(@PathVariable Long id, @RequestBody ContinentMapping ContinentMapping){
        return continentMappingService.updateContinentMapping(id, ContinentMapping);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteContinentMapping(@PathVariable Long id){
        return continentMappingService.deleteContinentMapping(id);
    }

    @GetMapping("/deces-per-continent")
    public List<Map<String, Object>> getInfoDecesParContinent() {
        return continentMappingService.getInfoDecesParContinent();
    }

    @GetMapping("/confirme-per-continent")
    public List<Map<String, Object>> getInfoConfirmeParContinent() {
        return continentMappingService.getInfoConfirmeParContinent();
    }
}
