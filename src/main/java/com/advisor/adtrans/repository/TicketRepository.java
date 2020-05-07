package com.advisor.adtrans.repository;


import com.advisor.adtrans.model.Ticket;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.Optional;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {

    Page<Ticket> findByCityId(Long cityID, Pageable pageable);
    Optional<Ticket> findByTicketIdAndCityID(Long OperatorID, Long cityID);
}
