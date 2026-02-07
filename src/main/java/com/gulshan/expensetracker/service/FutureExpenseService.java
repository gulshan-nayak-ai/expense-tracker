package com.gulshan.expensetracker.service;

import com.gulshan.expensetracker.entity.FutureExpense;
import com.gulshan.expensetracker.repository.FutureExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FutureExpenseService {

    private final FutureExpenseRepository repository;

    public FutureExpense save(FutureExpense expense){
        return repository.save(expense);
    }

    public List<FutureExpense> findAll(){
        return repository.findAll();
    }
}
