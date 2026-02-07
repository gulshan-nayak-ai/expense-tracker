package com.gulshan.expensetracker.service;

import com.gulshan.expensetracker.entity.Expense;
import com.gulshan.expensetracker.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseService {

    private final ExpenseRepository repository;

    public Expense save(Expense expense){
        return repository.save(expense);
    }

    public List<Expense> findAll(){
        return repository.findAll();
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}
