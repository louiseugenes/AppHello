package com.example.VotacaoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VotacaoController {

    private final VotacaoService votacaoService;

    @Autowired
    public VotacaoController(VotacaoService votacaoService) {
        this.votacaoService = votacaoService;
    }
    @GetMapping("/votar")
    public String votar(@RequestParam String nome){
        votacaoService.registrarVoto(nome);
        return "Voto recebido para o candidato: " +nome;

    }
}
