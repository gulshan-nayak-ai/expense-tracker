package com.gulshan.expensetracker.controller;

import com.gulshan.expensetracker.dto.IncomeDTO;
import com.gulshan.expensetracker.entity.Income;
import com.gulshan.expensetracker.service.IncomeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/income")
@RequiredArgsConstructor
public class IncomeController {

    private final IncomeService service;

    @PostMapping
    public IncomeDTO create(@Valid @RequestBody IncomeDTO income){
        return service.save(income);
    }

    @GetMapping
    public List<IncomeDTO> getAll(){
        return service.findAll();
    }
}
