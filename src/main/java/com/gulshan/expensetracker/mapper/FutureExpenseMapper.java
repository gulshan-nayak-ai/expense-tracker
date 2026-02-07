package com.gulshan.expensetracker.mapper;

import com.gulshan.expensetracker.dto.FutureExpenseDTO;
import com.gulshan.expensetracker.entity.FutureExpense;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.YearMonth;

@Mapper(componentModel = "spring")
public interface FutureExpenseMapper {

    FutureExpense toEntity(FutureExpenseDTO dto);

    FutureExpenseDTO toDTO(FutureExpense entity);


}
