package com.gulshan.expensetracker.entity;

import com.gulshan.expensetracker.constant.ExpenseType;
import jakarta.persistence.*;
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


    private String expense;


    private BigDecimal amount;


    private String bank;


    private Boolean isSent;

    private Boolean isPaid;

    @Enumerated(EnumType.STRING)
    private ExpenseType expenseType;

    private Integer month;

    private Integer year;

}
