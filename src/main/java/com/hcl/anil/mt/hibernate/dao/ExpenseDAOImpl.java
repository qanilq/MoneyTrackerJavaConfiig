package com.hcl.anil.mt.hibernate.dao;

import com.hcl.anil.mt.domain.DailyExpense;
import com.hcl.anil.mt.dto.DailyExpenseDTO;
import org.hibernate.Query;

import java.io.Serializable;
import java.util.List;

/**
 * Created by M ANIL KUMAR on 03-05-2015.
 */
public class ExpenseDAOImpl extends GenericDAOImpl<DailyExpense,Serializable>
        implements ExpenseDAO{
    @Override
    public List<DailyExpense> getDailyExpenseList() {
        String hql = "from DailyExpense d";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        List<DailyExpense> dailyExpenseList = query.list();
        return  dailyExpenseList;
    }
}
