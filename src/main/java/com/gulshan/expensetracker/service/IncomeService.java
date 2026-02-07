package com.gulshan.expensetracker.service;

import com.gulshan.expensetracker.dto.IncomeDTO;
import com.gulshan.expensetracker.entity.Income;
import com.gulshan.expensetracker.mapper.IncomeMapper;
import com.gulshan.expensetracker.repository.IncomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IncomeService {
    private final IncomeRepository repository;
    private final IncomeMapper mapper;

    public IncomeDTO save(IncomeDTO dto){
        Income entity = mapper.toEntity(dto);
        Income saved = repository.save(entity);
        return mapper.toDTO(saved);
    }

    public List<IncomeDTO> findAll(){
        return repository.findAll();
    }

}
