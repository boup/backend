package com.advisor.adtrans.controller;


import com.advisor.adtrans.exception.ResourceNotFoundException;
import com.advisor.adtrans.model.City;
import com.advisor.adtrans.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.Optional;

@RestController
public class CityController {


    @Autowired
    private CityRepository cityRepository;


    @GetMapping("/city")
    public Page<City> getAllCity(Pageable pageable) {
        return cityRepository.findAll((org.springframework.data.domain.Pageable) pageable);
    }


    @GetMapping("/city/{id}")
    public City retrieveCity(@PathVariable long id) {
        Optional<City> city = cityRepository.findById(id);

        if (!city.isPresent())
            throw new ResourceNotFoundException("id-" + id);

        return city.get();}
}
