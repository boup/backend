package com.advisor.adtrans.repository;

import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.Optional;

public interface OperatorRepository<Operator,Long> {
    Page<Operator> findByCityID(Long CityID, Pageable pageable);
    Optional<Operator> findByIdAndCityID(Long OpetarorID, Long CityID);
}
