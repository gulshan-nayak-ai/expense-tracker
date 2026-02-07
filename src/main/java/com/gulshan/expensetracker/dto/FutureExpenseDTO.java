package com.gulshan.expensetracker.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.YearMonth;

@Data
public class FutureExpenseDTO {
    private Long id;

    @NotBlank
    private String futureExpense;

    @NotNull
    @Positive
    private BigDecimal expectedAmount;

    private BigDecimal actualAmount;


    @NotNull
    @Min(1)
    @Max(12)
    private Integer month;

    @NotNull
    private Integer year;

}
