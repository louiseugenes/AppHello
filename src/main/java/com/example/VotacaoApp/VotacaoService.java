package com.example.VotacaoApp;

import org.springframework.stereotype.Service;

@Service
public class VotacaoService {
    public void registrarVoto(String candidato){
        System.out.println("Voto processado com sucesso para: "+candidato);
    }
}
