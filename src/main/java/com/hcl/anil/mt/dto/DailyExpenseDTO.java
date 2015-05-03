package com.hcl.anil.mt.dto;

import java.util.Date;

/**
 * Created by M ANIL KUMAR on 02-05-2015.
 */

public class DailyExpenseDTO {
    private Long expenseId;
    private String expenseName;
    private String expenseCategory;
    private Date expenseDate;
    private double expenseAmount;
    private String expenseLocation;
    private String expenseNote;


    public Long getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Long expenseId) {
        this.expenseId = expenseId;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public String getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(String expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    public double getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(double expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public String getExpenseLocation() {
        return expenseLocation;
    }

    public void setExpenseLocation(String expenseLocation) {
        this.expenseLocation = expenseLocation;
    }

    public String getExpenseNote() {
        return expenseNote;
    }

    public void setExpenseNote(String expenseNote) {
        this.expenseNote = expenseNote;
    }
}
