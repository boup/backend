package com.advisor.adtrans.controller;

import com.advisor.adtrans.exception.ResourceNotFoundException;
import com.advisor.adtrans.model.Line;
import com.advisor.adtrans.model.Ticket;
import com.advisor.adtrans.repository.CityRepository;

import com.advisor.adtrans.repository.TicketRepository;
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
public class TicketController {


    // @Autowired(required=false)

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private CityRepository cityRepository;


    @GetMapping("/city/{cityID}/ticket")

    public List<Ticket> getTicketByCity(@PathVariable Long cityID) {

        if(!ticketRepository.existsById(cityID)) {
            throw new ResourceNotFoundException("ticket not found!");
        }

        return ticketRepository.findByCityId(cityID);
    }

//    public Page<Ticket> getTicketByCityID (@PathVariable(value = "cityID") Long cityID,
//                                                Pageable pageable) {
//        return ticketRepository.findByCityId(cityID, pageable);
//    }


}
