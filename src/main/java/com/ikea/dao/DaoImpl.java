package com.ikea.dao;

import com.ikea.entites.BdT;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.criterion.Restrictions;
import java.math.BigDecimal;
import java.util.List;

public class DaoImpl implements Dao{

    @Autowired
    private SessionFactory sessionFactory;


    public BdT findBdById(BigDecimal id) {
        Criterion criterion = Restrictions.eq("bdId", id);
        org.hibernate.Criteria cr = this.sessionFactory.getCurrentSession().createCriteria(BdT.class).add(criterion);
        List<BdT> bdList = cr.list();
        return bdList.get(0);
    }
}
