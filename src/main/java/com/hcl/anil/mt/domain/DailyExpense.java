package com.hcl.anil.mt.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by M ANIL KUMAR on 02-05-2015.
 */

@Entity
@Table(name="Daily_Expense")
public class DailyExpense {

    private Long expenseId;
    private String expenseName;
    private String expenseCategory;
    private Date expenseDate;
    private double expenseAmount;
    private String expenseLocation;
    private String expenseNote;

    @Id
    @Column(name="EXPENSE_ID")
    public Long getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Long expenseId) {
        this.expenseId = expenseId;
    }

    @Column(name="EXPENSE_NAME")
    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    @Column(name = "EXPENSE_CATEGORY")
    public String getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(String expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    @Temporal(value = TemporalType.DATE)
    @Column(name = "EXPENSE_DATE")
    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    @Column(name = "EXPNSE_AMOUNT")
    public double getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(double expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    @Column(name = "EXPENSE_LOCATION")
    public String getExpenseLocation() {
        return expenseLocation;
    }

    public void setExpenseLocation(String expenseLocation) {
        this.expenseLocation = expenseLocation;
    }

    @Column(name = "EXPENSE_NOTE")
    public String getExpenseNote() {
        return expenseNote;
    }

    public void setExpenseNote(String expenseNote) {
        this.expenseNote = expenseNote;
    }
}
