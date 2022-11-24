package com.example.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ExchangeValueRepository extends
        JpaRepository<ExchangeValue,Long> {
    @Query("select e from ExchangeValue e where e.currency_from =:from and e.currency_to =:to ")
    ExchangeValue findByFromAndTO(String from,String to);
}
