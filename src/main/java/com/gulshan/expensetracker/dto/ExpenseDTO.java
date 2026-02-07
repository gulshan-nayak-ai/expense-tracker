package com.gulshan.expensetracker.dto;

import com.gulshan.expensetracker.constant.ExpenseType;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.YearMonth;

@Data
public class ExpenseDTO {
    private Long id;

    @NotBlank
    private String expense;

    @NotNull
    @Positive
    private BigDecimal amount;

    private String bank;

    private Boolean isSent;

    private Boolean isPaid;

    private ExpenseType expenseType;

    @NotNull
    @Min(1)
    @Max(12)
    private Integer month;

    @NotNull
    private Integer year;
}
