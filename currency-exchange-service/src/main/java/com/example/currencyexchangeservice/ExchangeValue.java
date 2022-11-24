package com.example.currencyexchangeservice;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity

public class ExchangeValue {
    @Id
    private long id;

    private String currency_from;

    private String currency_to;

    private BigDecimal conversionMultiple;
    private int port ;
    public ExchangeValue() {
    }

    public ExchangeValue(long id,
                         String from, String to,
                         BigDecimal conversionMultiple) {
        this.id = id;
        this.currency_from = from;
        this.currency_to = to;
        this.conversionMultiple = conversionMultiple;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFrom() {
        return currency_from;
    }

    public void setFrom(String from) {
        this.currency_from = from;
    }

    public String getTo() {
        return currency_to;
    }

    public void setTo(String to) {
        this.currency_to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }
}
