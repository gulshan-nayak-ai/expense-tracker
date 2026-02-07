package com.gulshan.expensetracker.controller;

import com.gulshan.expensetracker.entity.Income;
import com.gulshan.expensetracker.service.IncomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/income")
@RequiredArgsConstructor
public class IncomeController {

    private final IncomeService service;

    @PostMapping
    public Income create(@RequestBody Income income){
        return service.save(income);
    }

    @GetMapping
    public List<Income> getAll(){
        return service.findAll();
    }
}
