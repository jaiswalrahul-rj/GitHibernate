package com.ikea.dao;

import com.ikea.entites.BdT;

import java.math.BigDecimal;

public interface Dao {
    public BdT findBdById(BigDecimal id);
}
