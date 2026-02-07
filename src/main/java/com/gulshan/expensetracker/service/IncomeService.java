package com.gulshan.expensetracker.service;

import com.gulshan.expensetracker.entity.Income;
import com.gulshan.expensetracker.repository.IncomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IncomeService {
    private final IncomeRepository repository;

    public Income save(Income income){
        return repository.save(income);
    }

    public List<Income> findAll(){
        return repository.findAll();
    }

}
