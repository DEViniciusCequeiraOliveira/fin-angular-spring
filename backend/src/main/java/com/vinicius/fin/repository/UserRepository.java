package com.vinicius.fin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.fin.models.Usuario;

public interface  UserRepository extends JpaRepository<Usuario, Long>{
    
}
