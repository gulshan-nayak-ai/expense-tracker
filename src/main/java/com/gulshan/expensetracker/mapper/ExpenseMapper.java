package com.gulshan.expensetracker.mapper;

import com.gulshan.expensetracker.dto.ExpenseDTO;
import com.gulshan.expensetracker.entity.Expense;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.YearMonth;

@Mapper(componentModel = "spring")
public interface  ExpenseMapper {

    Expense toEntity(ExpenseDTO dto);

    ExpenseDTO toDTO(Expense entity);
}
