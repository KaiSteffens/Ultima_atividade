package com.example.corrida.Service;

import com.example.corrida.Entity.Inscricao;
import com.example.corrida.Entity.Maratona;
import com.example.corrida.Entity.Maratonista;
import com.example.corrida.Repository.MaratonaRepository;
import com.example.corrida.Repository.MaratonistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaratonaService {

        private MaratonaRepository maratonaRepository;

        @Autowired
        public MaratonaService(MaratonaRepository maratonaRepository) {
            this.maratonaRepository = maratonaRepository;
        }

        public Maratona salvarMaratona(Maratona maratona ) {
            return maratonaRepository.save(maratona);
        }
    public Maratona buscarMaratona(Long id) {
        return maratonaRepository.findById(id).get();
    }

    public List<Maratona> listarMaratonas() {
        return maratonaRepository.findAll();
    }

}


