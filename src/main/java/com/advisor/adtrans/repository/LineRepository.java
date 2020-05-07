package com.advisor.adtrans.repository;

import com.advisor.adtrans.model.City;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.Optional;

public interface LineRepository<Line, Long> {
    Page<City> findByCityID(Long CityID, Pageable pageable);
    Optional<City> findByIdAndCityID(Long LineID, Long CityID);
}
