package com.gulshan.expensetracker.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.YearMonth;

@Data
public class IncomeDTO {
    private Long id;

    @NotBlank
    private String source;

    @NotNull
    @Positive
    private BigDecimal amount;

    private String bank;

    @NotNull
    @Min(1)
    @Max(12)
    private Integer month;

    @NotNull
    private Integer year;
}
