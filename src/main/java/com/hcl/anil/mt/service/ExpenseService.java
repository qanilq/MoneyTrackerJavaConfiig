package com.hcl.anil.mt.service;

import com.hcl.anil.mt.domain.DailyExpense;
import com.hcl.anil.mt.dto.DailyExpenseDTO;
import com.hcl.anil.mt.hibernate.dao.ExpenseDAO;
import com.hcl.anil.mt.mapper.ExpenseMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by M ANIL KUMAR on 03-05-2015.
 */
public class ExpenseService {

    @Autowired
    ExpenseDAO expenseDAO;
    @Autowired
    ExpenseMapper expenseMapper;

    public DailyExpenseDTO addExpense(DailyExpenseDTO dailyExpenseDTO){

        DailyExpense dailyExpense = expenseMapper.mapDTOToEntity(dailyExpenseDTO);
        expenseDAO.save(dailyExpense);
        return dailyExpenseDTO;
    }
    public List<DailyExpenseDTO> getAllDailyExpenses(){
        List<DailyExpense> dailyExpenseList = expenseDAO.getDailyExpenseList();
        List<DailyExpenseDTO> dailyExpenseDTO = expenseMapper.mapEnititesToDTO(dailyExpenseList);
        return  dailyExpenseDTO;
    }
}
