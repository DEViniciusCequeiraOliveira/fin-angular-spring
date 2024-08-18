package com.vinicius.fin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vinicius.fin.DTO.ContaDTO;
import com.vinicius.fin.repository.ContaRepository;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    public Page<ContaDTO> getAllConta(Pageable pageable) {
        return contaRepository.findAll(pageable).map(ContaDTO::new);
    }
}
