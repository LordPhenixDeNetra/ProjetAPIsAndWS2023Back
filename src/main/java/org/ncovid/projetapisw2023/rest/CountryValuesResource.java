package org.ncovid.projetapisw2023.rest;

import lombok.AllArgsConstructor;
import org.ncovid.projetapisw2023.model.CountryValues;
import org.ncovid.projetapisw2023.service.country.ICountryValuesServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/country-values")
public class CountryValuesResource {


    private final ICountryValuesServiceImpl countryValuesService;

    @PostMapping("/create")
    public CountryValues createCountryValues(CountryValues countryValues){
        return countryValuesService.createCountryValues(countryValues);
    }

    @GetMapping
    public List<CountryValues> readCountryValues(){
        return countryValuesService.readCountryValues();
    }

    @PutMapping("/update/{id}")
    public CountryValues updateCountryValues(@PathVariable Long id, @RequestBody CountryValues countryValues){
        return countryValuesService.updateCountryValues(id, countryValues);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCountryValues(@PathVariable Long id){
        return countryValuesService.deleteCountryValues(id);
    }

    @GetMapping("/totalConfirme")
    public Long getTotalConfirme(){
        return countryValuesService.getTotalConfirme();
    }

    @GetMapping("/totalDeces")
    public Long getTotalDeces(){
        return countryValuesService.getTotalDeces();
    }


}
