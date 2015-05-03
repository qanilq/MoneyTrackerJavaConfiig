package com.hcl.anil.mt.hibernate.dao;

import com.hcl.anil.mt.domain.DailyExpense;
import com.hcl.anil.mt.dto.DailyExpenseDTO;

import java.io.Serializable;
import java.util.List;

/**
 * Created by M ANIL KUMAR on 03-05-2015.
 */
public interface ExpenseDAO extends GenericDAO<DailyExpense,Serializable> {
    List<DailyExpense> getDailyExpenseList();
}
