package com.hcl.anil.mt.controller;

import com.hcl.anil.mt.dto.DailyExpenseDTO;
import com.hcl.anil.mt.hibernate.dao.ExpenseDAO;
import com.hcl.anil.mt.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by M ANIL KUMAR on 03-05-2015.
 */
@Controller
public class ExpenseController {
    @Autowired
    ExpenseService expenseService;

    @RequestMapping(value = "/expEntryDisplay",
            method = {RequestMethod.GET,RequestMethod.POST})
    public String expenseEntryAndDisplay(@ModelAttribute(value = "dailyExpense")DailyExpenseDTO dailyExpenseDTO,
                                         ModelMap modelMap){
        expenseService.addExpense(dailyExpenseDTO);
        List<DailyExpenseDTO> dailyExpenseDTOs = expenseService.getAllDailyExpenses();
        modelMap.addAttribute("dailyExpenseDTOs",dailyExpenseDTOs);
        return "expenseEntryAndDisplay";
    }

}
