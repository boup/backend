package com.advisor.adtrans.repository;


import com.advisor.adtrans.model.TransCity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;

import java.util.Optional;

@Repository
public interface TransCityRepository extends JpaRepository<TransCity,Long> {

    Page<TransCity> findByCityId(Long cityID, Pageable pageable);
    Optional<TransCity> findByTransIDAndCityID(Long TransID, Long cityID);
}
