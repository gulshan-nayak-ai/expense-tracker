package com.gulshan.expensetracker.service;

import com.gulshan.expensetracker.dto.FutureExpenseDTO;
import com.gulshan.expensetracker.entity.FutureExpense;
import com.gulshan.expensetracker.mapper.FutureExpenseMapper;
import com.gulshan.expensetracker.repository.FutureExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FutureExpenseService {

    private final FutureExpenseRepository repository;
    private final FutureExpenseMapper mapper;

    public FutureExpenseDTO  save(FutureExpenseDTO dto){
        FutureExpense entity = mapper.toEntity(dto);
        return mapper.toDTO(repository.save(entity));
    }

    public List<FutureExpenseDTO> findAll(){
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }
}
