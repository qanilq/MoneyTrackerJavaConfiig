package com.hcl.anil.mt.dto;

import com.hcl.anil.mt.domain.DailyExpense;

import java.util.List;

/**
 * Created by M ANIL KUMAR on 02-05-2015.
 */
public class MonthlyExpense {
    List<DailyExpense> monthlyExpenses;
    private double monthlyTotalAmont;

    public List<DailyExpense> getMonthlyExpenses() {
        return monthlyExpenses;
    }

    public void setMonthlyExpenses(List<DailyExpense> monthlyExpenses) {
        this.monthlyExpenses = monthlyExpenses;
    }

    public double getMonthlyTotalAmont() {
        return monthlyTotalAmont;
    }

    public void setMonthlyTotalAmont(double monthlyTotalAmont) {
        this.monthlyTotalAmont = monthlyTotalAmont;
    }
}
