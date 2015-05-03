package com.hcl.anil.mt.mapper;

import com.hcl.anil.mt.domain.DailyExpense;
import com.hcl.anil.mt.dto.DailyExpenseDTO;

import java.util.List;

/**
 * Created by M ANIL KUMAR on 03-05-2015.
 */
public interface ExpenseMapper {

    DailyExpense mapDTOToEntity(DailyExpenseDTO dailyExpenseDTO);
    DailyExpenseDTO mapEntityToDTO(DailyExpense dailyExpense);
    List<DailyExpenseDTO> mapEnititesToDTO(List<DailyExpense> dailyExpensesList);
    List<DailyExpense> mapDTOsToEntities(List<DailyExpenseDTO> dailyExpenseDTOList);
}
