package com.vinicius.fin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinicius.fin.models.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

}