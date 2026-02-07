package com.gulshan.expensetracker.controller;

import com.gulshan.expensetracker.dto.ExpenseDTO;
import com.gulshan.expensetracker.entity.Expense;
import com.gulshan.expensetracker.service.ExpenseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseService service;

    @PostMapping
    public ExpenseDTO create(@Valid @RequestBody ExpenseDTO  expense){
        return service.save(expense);
    }

    @GetMapping
    public List<ExpenseDTO> getAll(){
        return service.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
