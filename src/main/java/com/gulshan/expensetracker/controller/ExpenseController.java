package com.gulshan.expensetracker.controller;

import com.gulshan.expensetracker.entity.Expense;
import com.gulshan.expensetracker.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseService service;

    @PostMapping
    public Expense create(@RequestBody Expense expense){
        return service.save(expense);
    }

    @GetMapping
    public List<Expense> getAll(){
        return service.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
