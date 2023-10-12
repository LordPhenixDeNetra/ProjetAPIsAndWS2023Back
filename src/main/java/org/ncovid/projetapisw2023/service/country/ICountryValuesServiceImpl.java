package org.ncovid.projetapisw2023.service.country;

import lombok.AllArgsConstructor;
import org.ncovid.projetapisw2023.model.CountryValues;
import org.ncovid.projetapisw2023.repository.CountryValuesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ICountryValuesServiceImpl implements ICountryValuesService{

    private final CountryValuesRepository countryValuesRepository;

    @Override
    public CountryValues createCountryValues(CountryValues CountryValues) {
        return countryValuesRepository.save(CountryValues);
    }

    @Override
    public List<CountryValues> readCountryValues() {
        return countryValuesRepository.findAll();
    }

    @Override
    public CountryValues updateCountryValues(Long id, CountryValues countryValues) {
        return countryValuesRepository.findById(id)
                .map(c ->{
                    c.setPays(countryValues.getPays());
                    c.setConfirme(countryValues.getConfirme());
                    c.setDeces(countryValues.getDeces());
                    c.setGuerisons(countryValues.getGuerisons());

                    return countryValuesRepository.save(c);
                }).orElseThrow(()->new RuntimeException("Updated CountryValues"));
    }

    @Override
    public String deleteCountryValues(Long id) {
        countryValuesRepository.deleteById(id);
        return "Deleted CountryValues";
    }

    @Override
    public Long getTotalConfirme() {
        return countryValuesRepository.sumConfirm();
    }

    @Override
    public Long getTotalDeces(){
        return countryValuesRepository.sumDeces();
    }


}
