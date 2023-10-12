package org.ncovid.projetapisw2023.service.country;

import org.ncovid.projetapisw2023.model.CountryValues;

import java.util.List;

public interface ICountryValuesService {

    public CountryValues createCountryValues(CountryValues countryValues);

    public List<CountryValues> readCountryValues();

    public CountryValues updateCountryValues(Long id, CountryValues countryValues);

    public String deleteCountryValues(Long id);

    public Long getTotalConfirme();

    public Long getTotalDeces();
}
