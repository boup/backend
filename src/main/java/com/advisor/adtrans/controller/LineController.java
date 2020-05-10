package com.advisor.adtrans.controller;

import com.advisor.adtrans.exception.ResourceNotFoundException;
import com.advisor.adtrans.model.Line;
import com.advisor.adtrans.repository.CityRepository;
import com.advisor.adtrans.repository.LineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;

import java.util.List;

//import java.awt.print.Pageable;
@RestController
@RequestMapping("/api")
public class LineController {

    //@Autowired(required=false)

    @Autowired
    private LineRepository lineRepository;

    @Autowired
    private CityRepository cityRepository;


    @GetMapping("/city/{cityid}/line")
    public List<Line> getLineByCity(@PathVariable Long cityid) {

        if(!lineRepository.existsById(cityid)) {
            throw new ResourceNotFoundException("city not found!");
        }

        return lineRepository.findByCity_Id(cityid);
    }

//    public Page<Line> getAllLineByCityId(@PathVariable(value = "cityID") Long cityID, Pageable pageable) {
//        return lineRepository.findByCityId(cityID, pageable);
//    }
   // @GetMapping("/students/{studentId}/assignments")

}
