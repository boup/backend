package com.advisor.adtrans.controller;

import com.advisor.adtrans.model.Line;
import com.advisor.adtrans.repository.CityRepository;
import com.advisor.adtrans.repository.LineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
@RestController
public class LineController {

    @Autowired
    private LineRepository lineRepository;

    @Autowired
    private CityRepository cityRepository;


    @GetMapping("/city/{cityID}/line")
    public Page<Line> getAllLineByCityId(@PathVariable(value = "cityID") Long cityID,
                                         Pageable pageable) {
        return lineRepository.findByCityId(cityID, pageable);
    }

}
