package com.example.corrida.Service;

import com.example.corrida.Entity.Circuito;
import com.example.corrida.Entity.Enum.Categorias;
import com.example.corrida.Entity.Inscricao;
import com.example.corrida.Entity.Maratona;
import com.example.corrida.Entity.Maratonista;
import com.example.corrida.Repository.CircuitoRepository;
import com.example.corrida.Repository.InscricaoRepository;
import com.example.corrida.Repository.MaratonistaRepository;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscricaoService {
    @Autowired
    private InscricaoRepository inscricaoRepository;
    @Autowired
    private MaratonistaRepository maratonistaRepository;
    @Autowired
    private CircuitoRepository circuitoRepository;

   @Autowired
    public void InscricaoRepository (InscricaoRepository inscricaoRepository) {
        this.inscricaoRepository= inscricaoRepository;
    }
    public Maratonista maratonista=new Maratonista();

    public Inscricao SalvarInscricao(Inscricao inscricao) {

    Circuito circuito = circuitoRepository.findById(inscricao.getId()).get();

        int idade = maratonistaRepository.findById(maratonista.getId()).get().getIdade();



        switch (circuito.getCategorias()) {
            case PEQUENO:
                if (idade >= 18) {
                    inscricao.setValorInscricao(1500.0);
                } else {
                    inscricao.setValorInscricao(1300.0);
                }
                break;
            case MEDIO:
                if (idade >= 18) {
                    inscricao.setValorInscricao(2500.0);
                } else {
                    inscricao.setValorInscricao(2000.0);
                }
                break;
            case AVANCADO:
                if (idade >= 18) {
                    inscricao.setValorInscricao(2800.0);
                } else {
                    throw new IllegalArgumentException("Você precisa ter mais de 18 anos");
                }
                break;
            default:
                throw new IllegalArgumentException("Tipo de circuito inválido");
        }
        return inscricaoRepository.save(inscricao);
    }

    public Inscricao buscarInscricao(Long id) {
        return inscricaoRepository.findById(id).get();
    }

    public List<Inscricao> listarinscricao() {
        return inscricaoRepository.findAll();
    }

}


