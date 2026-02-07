package com.gulshan.expensetracker.repository;

import com.gulshan.expensetracker.entity.FutureExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FutureExpenseRepository extends JpaRepository<FutureExpense, Long> {
}
