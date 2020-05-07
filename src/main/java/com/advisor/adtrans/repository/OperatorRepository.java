package com.advisor.adtrans.repository;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.Optional;

@Repository
public interface OperatorRepository<Operator,Long> {
    Page<Operator> findByCityId(Long cityID, Pageable pageable);
    Optional<Operator> findByOperatorIDAndCityID(Long OperatorID, Long cityID);
}
