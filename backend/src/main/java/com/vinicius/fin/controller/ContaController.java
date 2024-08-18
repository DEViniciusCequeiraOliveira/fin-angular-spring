package com.vinicius.fin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.fin.DTO.ContaDTO;
import com.vinicius.fin.security.AuthenticationService;
import com.vinicius.fin.service.ContaService;

@RestController
@RequestMapping
public class ContaController {

    @Autowired
    private ContaService contaService;

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/conta")
    public ResponseEntity<Page<ContaDTO>> getContas(Pageable pageable) {
        return ResponseEntity.ok().body(contaService.getAllConta(pageable));
    }

    @GetMapping("/home")
    public String getMethodName() {
        return "Olá Mundo";
    }

    @GetMapping("/page1")
    public String page1() {
        return "Olá Mundo Page 1";
    }

    @GetMapping("/page2")
    public String page2() {
        return "Olá Mundo Page 2";
    }
    @GetMapping("/page3")
    public String page3() {
        return "Olá Mundo Page 3";
    }

    @GetMapping("/page4")
    public String page4() {
        return "Olá Mundo Page 4";
    }


    @PostMapping("/login")
    public String authenticate(Authentication authentication) {
        return authenticationService.authenticate(authentication);
    }
}
