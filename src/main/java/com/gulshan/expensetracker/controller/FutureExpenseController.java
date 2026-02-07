package com.gulshan.expensetracker.controller;

import com.gulshan.expensetracker.entity.FutureExpense;
import com.gulshan.expensetracker.service.FutureExpenseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/future-expenses")
@RequiredArgsConstructor
public class FutureExpenseController {

    private final FutureExpenseService service;

    @PostMapping
    public FutureExpense create(@Valid @RequestBody FutureExpense expense){
        return service.save(expense);
    }

    @GetMapping
    public List<FutureExpense> getAll(){
        return service.findAll();
    }

}
