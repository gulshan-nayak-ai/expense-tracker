package com.gulshan.expensetracker.mapper;

import com.gulshan.expensetracker.dto.IncomeDTO;
import com.gulshan.expensetracker.entity.Income;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.YearMonth;

@Mapper(componentModel = "spring")
public interface IncomeMapper {

    Income toEntity(IncomeDTO dto);


    IncomeDTO toDTO(Income entity);


}
