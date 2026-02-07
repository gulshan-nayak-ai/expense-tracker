package com.gulshan.expensetracker.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class FutureExpenseDTO {
    private Long id;

    @NotBlank
    private String futureExpense;

    @NotNull
    @Positive
    private BigDecimal expectedAmount;

    private BigDecimal actualAmount;

    private String monthToBeSpent;
}
