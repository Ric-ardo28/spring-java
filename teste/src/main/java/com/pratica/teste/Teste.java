package com.pratica.teste;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
public class Teste {

    @GetMapping
    public String ola(){
        return "Ola meu nome é ricardo";
    }
}
