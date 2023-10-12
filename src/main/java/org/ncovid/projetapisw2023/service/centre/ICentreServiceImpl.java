package org.ncovid.projetapisw2023.service.centre;

import lombok.AllArgsConstructor;
import org.ncovid.projetapisw2023.model.Centre;
import org.ncovid.projetapisw2023.repository.CentreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ICentreServiceImpl implements ICentreService{

    private final CentreRepository centreRepository;


    @Override
    public Centre createCentre(Centre centre) {
        return centreRepository.save(centre);
    }

    @Override
    public List<Centre> readCentre() {
        return centreRepository.findAll();
    }

    @Override
    public Centre updateCentre(Long id, Centre centre) {
        return centreRepository.findById(id)
                .map(c ->{
                    c.setNomCentre(centre.getNomCentre());
                    c.setPositionCentre(centre.getPositionCentre());
                    c.setContactCentre(centre.getContactCentre());
                    c.setRegionCentre(centre.getRegionCentre());
                    c.setVilleCentre(centre.getVilleCentre());
                    c.setCommuneCentre(centre.getCommuneCentre());
                    c.setAdresseCentre(centre.getAdresseCentre());

                    return centreRepository.save(c);
                }).orElseThrow(()->new RuntimeException("Updated Centre"));
    }

    @Override
    public String deleteCentre(Long id) {
        centreRepository.deleteById(id);
        return "Deleted Centre";
    }
}
