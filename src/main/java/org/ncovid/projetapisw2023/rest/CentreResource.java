package org.ncovid.projetapisw2023.rest;

import lombok.AllArgsConstructor;
import org.ncovid.projetapisw2023.model.Centre;
import org.ncovid.projetapisw2023.service.centre.ICentreServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/centre")
public class CentreResource {

    private final ICentreServiceImpl centreService;

    @PostMapping("/create")
    public Centre createCentre(Centre centre){
        return centreService.createCentre(centre);
    }

    @GetMapping
    public List<Centre> readCentre(){
        return centreService.readCentre();
    }

    @PutMapping("/update/{id}")
    public Centre updateCentre(@PathVariable Long id, @RequestBody Centre centre){
        return centreService.updateCentre(id, centre);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCentre(@PathVariable Long id){
        return centreService.deleteCentre(id);
    }

}
