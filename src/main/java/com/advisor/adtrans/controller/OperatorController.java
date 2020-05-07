package com.advisor.adtrans.controller;


import com.advisor.adtrans.model.Operator;
import com.advisor.adtrans.repository.CityRepository;
import com.advisor.adtrans.repository.OperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
public class OperatorController {

@Autowired
    private OperatorRepository operatorRepository;

@Autowired
    private CityRepository cityRepository;


@GetMapping("/city/{cityID}/operator")
    public Page<Operator> getAllOperatorByCityID (@PathVariable(value = "cityID") Long cityID,
                                                  Pageable pageable) {
    return operatorRepository.findByCityId(cityID, pageable);
    }

}
