package com.advisor.adtrans.repository;

import com.advisor.adtrans.model.City;
import com.advisor.adtrans.model.Line;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.Optional;


@Repository
public interface LineRepository<Line, Long> {
    Page<Line> findByCityId(Long cityID, Pageable pageable);

    Optional<Line> findByLineIDAndCityID(Long LineID,Long cityID);
}
