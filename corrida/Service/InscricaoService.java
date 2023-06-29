package com.example.corrida.Service;

import com.example.corrida.Entity.Inscricao;
import com.example.corrida.Entity.Maratona;
import com.example.corrida.Entity.Maratonista;
import com.example.corrida.Repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscricaoService {
    private InscricaoRepository inscricaoRepository;

   @Autowired
    public void InscricaoRepository (InscricaoRepository inscricaoRepository) {
        this.inscricaoRepository= inscricaoRepository;
    }

    public Inscricao SalvarInscricao(Inscricao inscricao  ) {
            return inscricaoRepository.save(inscricao);
        }

    public Inscricao buscarInscricao(Long id) {
        return inscricaoRepository.findById(id).get();
    }

    public List<Inscricao> listarinscricao() {
        return inscricaoRepository.findAll();
    }

}


