package com.example.corrida.Service;

import com.example.corrida.Entity.Inscricao;
import com.example.corrida.Entity.Maratonista;
import com.example.corrida.Repository.MaratonistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaratonistaService {

    private MaratonistaRepository maratonistaRepository;

    @Autowired
    public MaratonistaService(MaratonistaRepository maratonistaRepository) {
        this.maratonistaRepository = maratonistaRepository;
    }

    public Maratonista salvarMaratonista(Maratonista maratonista) {
        return maratonistaRepository.save(maratonista);
    }
    public Maratonista buscarMaratonista(Long id) {
        return maratonistaRepository.findById(id).get();
    }

    public List<Maratonista> listarMaratonistas() {
        return maratonistaRepository.findAll();
    }

}
