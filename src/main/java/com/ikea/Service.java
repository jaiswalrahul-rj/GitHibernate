package com.ikea;

import com.ikea.dao.Dao;
import com.ikea.entites.BdT;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Dao bdTDao;

    public BdT getBd(BigDecimal id) {
        return bdTDao.findBdById(id);

    }

}
