package com.gulshan.expensetracker.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class IncomeDTO {
    private Long id;

    @NotBlank
    private String source;

    @NotNull
    @Positive
    private BigDecimal amount;

    private String bank;

    private String monthYear;
}
