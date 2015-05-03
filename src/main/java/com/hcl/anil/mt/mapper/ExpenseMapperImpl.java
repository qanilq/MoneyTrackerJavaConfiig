package com.hcl.anil.mt.mapper;

import com.hcl.anil.mt.domain.DailyExpense;
import com.hcl.anil.mt.dto.DailyExpenseDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by M ANIL KUMAR on 03-05-2015.
 */
public class ExpenseMapperImpl implements ExpenseMapper {
    @Override
    public DailyExpense mapDTOToEntity(DailyExpenseDTO dailyExpenseDTO) {
        DailyExpense dailyExpense = new DailyExpense();

        dailyExpense.setExpenseId(dailyExpenseDTO.getExpenseId());
        dailyExpense.setExpenseName(dailyExpenseDTO.getExpenseName());
        dailyExpense.setExpenseCategory(dailyExpenseDTO.getExpenseCategory());
        dailyExpense.setExpenseDate(dailyExpenseDTO.getExpenseDate());
        dailyExpense.setExpenseAmount(dailyExpenseDTO.getExpenseAmount());
        dailyExpense.setExpenseLocation(dailyExpenseDTO.getExpenseLocation());
        dailyExpense.setExpenseNote(dailyExpenseDTO.getExpenseNote());
        return dailyExpense;
    }

    @Override
    public DailyExpenseDTO mapEntityToDTO(DailyExpense dailyExpense) {
       DailyExpenseDTO dailyExpenseDTO = new DailyExpenseDTO();

        dailyExpenseDTO.setExpenseId(dailyExpense.getExpenseId());
        dailyExpenseDTO.setExpenseName(dailyExpense.getExpenseName());
        dailyExpenseDTO.setExpenseCategory(dailyExpense.getExpenseCategory());
        dailyExpenseDTO.setExpenseDate(dailyExpense.getExpenseDate());
        dailyExpenseDTO.setExpenseAmount(dailyExpense.getExpenseAmount());
        dailyExpenseDTO.setExpenseLocation(dailyExpense.getExpenseLocation());
        dailyExpenseDTO.setExpenseNote(dailyExpense.getExpenseNote());
        return  dailyExpenseDTO;
    }

    @Override
    public List<DailyExpenseDTO> mapEnititesToDTO(List<DailyExpense> dailyExpensesList) {
        List<DailyExpenseDTO> dailyExpenseDTOList = new ArrayList<DailyExpenseDTO>();
        for(DailyExpense dailyExpense: dailyExpensesList){
            DailyExpenseDTO dailyExpenseDTO = mapEntityToDTO(dailyExpense);
            dailyExpenseDTOList.add(dailyExpenseDTO);
        }
        return dailyExpenseDTOList;
    }

    @Override
    public List<DailyExpense> mapDTOsToEntities(List<DailyExpenseDTO> dailyExpenseDTOList) {
        List<DailyExpense> dailyExpenseList = new ArrayList<DailyExpense>();
        for(DailyExpenseDTO dailyExpenseDTO:dailyExpenseDTOList){
            DailyExpense dailyExpense = mapDTOToEntity(dailyExpenseDTO);
            dailyExpenseDTOList.add(dailyExpenseDTO);
        }
        return dailyExpenseList;
    }
}
