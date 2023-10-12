package org.ncovid.projetapisw2023.service.centre;

import org.ncovid.projetapisw2023.model.Centre;

import java.util.List;

public interface ICentreService {

    public Centre createCentre(Centre centre);

    public List<Centre> readCentre();

    public Centre updateCentre(Long id, Centre centre);

    public String deleteCentre(Long id);
}
