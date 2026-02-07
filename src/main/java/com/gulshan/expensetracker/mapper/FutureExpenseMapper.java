package com.gulshan.expensetracker.mapper;

import com.gulshan.expensetracker.dto.FutureExpenseDTO;
import com.gulshan.expensetracker.entity.FutureExpense;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.YearMonth;

@Mapper(componentModel = "spring")
public interface FutureExpenseMapper {

    @Mapping(target = "monthToBeSpent",
            expression = "java(mapYearMonth(dto.getMonthToBeSpent()))")
    FutureExpense toEntity(FutureExpenseDTO dto);

    @Mapping(target = "monthToBeSpent",
            expression = "java(entity.getMonthToBeSpent().toString())")
    FutureExpenseDTO toDTO(FutureExpense entity);

    default YearMonth mapYearMonth(String value){
        return value != null ? YearMonth.parse(value) : null;
    }
}
