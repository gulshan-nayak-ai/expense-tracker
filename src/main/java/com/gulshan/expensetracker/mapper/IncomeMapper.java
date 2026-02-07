package com.gulshan.expensetracker.mapper;

import com.gulshan.expensetracker.dto.IncomeDTO;
import com.gulshan.expensetracker.entity.Income;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.YearMonth;

@Mapper(componentModel = "spring")
public interface IncomeMapper {

    @Mapping(target = "monthYear",
            expression = "java(mapYearMonth(dto.getMonthYear()))")
    Income toEntity(IncomeDTO dto);

    @Mapping(target = "monthYear",
            expression = "java(entity.getMonthYear().toString())")
    IncomeDTO toDTO(Income entity);

    default YearMonth mapYearMonth(String value){
        return value != null ? YearMonth.parse(value) : null;
    }
}
