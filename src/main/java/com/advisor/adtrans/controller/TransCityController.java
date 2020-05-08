package com.advisor.adtrans.controller;

import com.advisor.adtrans.model.Operator;
import com.advisor.adtrans.model.TransCity;
import com.advisor.adtrans.repository.CityRepository;
import com.advisor.adtrans.repository.OperatorRepository;
import com.advisor.adtrans.repository.TransCityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.Pageable;


@RestController
public class TransCityController {



    @Autowired(required=false)
    private TransCityRepository transCityRepository;

    @Autowired
    private CityRepository cityRepository;


    @GetMapping("/city/{cityID}/transcity")
    public Page<TransCity> getAllTransCityByCityID (@PathVariable(value = "cityID") Long cityID, Pageable pageable) {
        return transCityRepository.findByCityId(cityID, pageable);
    }
}
