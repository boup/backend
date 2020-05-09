package com.advisor.adtrans.controller;


import com.advisor.adtrans.exception.ResourceNotFoundException;
import com.advisor.adtrans.model.Line;
import com.advisor.adtrans.model.Operator;
import com.advisor.adtrans.repository.CityRepository;
import com.advisor.adtrans.repository.OperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.Pageable;

import java.util.List;


@RestController
@RequestMapping("/api")
public class OperatorController {

    @Autowired
    //@Autowired(required=false)
    private OperatorRepository operatorRepository;

@Autowired
    private CityRepository cityRepository;


@GetMapping("/city/{cityId}/operator")

public List<Operator> getOperatorByCity(@PathVariable Long cityId) {
    if(!operatorRepository.existsById(cityId)) {
        throw new ResourceNotFoundException("city not found!");
    }
    return operatorRepository.findByCityId(cityId);
  }
//    public Page<Operator> getAllOperatorByCityID (@PathVariable(value = "cityID") Long cityID,
//                                                  Pageable pageable) {
//    return operatorRepository.findByCityId(cityID, pageable);
//    }


}
