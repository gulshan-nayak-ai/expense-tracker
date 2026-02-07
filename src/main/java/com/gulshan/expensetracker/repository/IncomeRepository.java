package com.gulshan.expensetracker.repository;

import com.gulshan.expensetracker.entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Long> {

}
