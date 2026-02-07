package com.gulshan.expensetracker.service;

import com.gulshan.expensetracker.dto.ExpenseDTO;
import com.gulshan.expensetracker.entity.Expense;
import com.gulshan.expensetracker.mapper.ExpenseMapper;
import com.gulshan.expensetracker.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseService {

    private final ExpenseRepository repository;
    private final ExpenseMapper mapper;

    public ExpenseDTO  save(ExpenseDTO dto){
        Expense expense = mapper.toEntity(dto);
        Expense saved = repository.save(expense);

        return mapper.toDTO(saved);
    }

    public List<ExpenseDTO> findAll(){
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}
