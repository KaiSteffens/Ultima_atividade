package com.example.corrida.Service;

import com.example.corrida.Controller.CircuitoController;
import com.example.corrida.Entity.Circuito;
import com.example.corrida.Entity.Inscricao;
import com.example.corrida.Repository.CircuitoRepository;
import com.example.corrida.Repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CircuitoService {
    private CircuitoRepository circuitoRepository;


    @Autowired
    public void CircuitoRepository(CircuitoRepository circuitoRepository) {
        this.circuitoRepository = circuitoRepository;
    }

    public Circuito SalvarCircuito(Circuito circuito) {
        return circuitoRepository.save(circuito);
    }

    public Circuito buscarCircuito(Long id) {
        return circuitoRepository.findById(id).get();
    }

    public List<Circuito> listarCircuitos() {
        return circuitoRepository.findAll();
    }
}


