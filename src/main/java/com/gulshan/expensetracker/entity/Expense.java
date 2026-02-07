package com.gulshan.expensetracker.entity;

import com.gulshan.expensetracker.constant.ExpenseType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.YearMonth;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Expense name cannot be empty")
    private String expense;

    @NotNull
    @Positive
    private BigDecimal amount;

    @NotBlank
    private String bank;

    @NotNull
    private Boolean isSent;

    private Boolean isPaid;

    @Enumerated(EnumType.STRING)
    private ExpenseType expenseType;

    @NotNull
    private YearMonth monthYear;

}
