package com.example.corrida.Controller;

import com.example.corrida.Entity.Inscricao;
import com.example.corrida.Entity.Maratona;
import com.example.corrida.Entity.Maratonista;
import com.example.corrida.Repository.MaratonistaRepository;
import com.example.corrida.Service.MaratonistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sistema")

public class maratonistaController {

    @Autowired
    private MaratonistaService maratonistaService;

    @PostMapping("maratonista")

    public ResponseEntity<Maratonista> salvarMaratonista(@RequestBody Maratonista maratonista) {
        return ResponseEntity.status(HttpStatus.CREATED).body(maratonistaService.salvarMaratonista(maratonista));

    }
    @GetMapping("maratonista/{id}")
    public Maratonista buscarMaratonistaPorId(@PathVariable long id) {
        return maratonistaService.buscarMaratonista(id);


    }
    @GetMapping("maratonistas")
    public List<Maratonista> ListarMaratonistas() {
        return maratonistaService.listarMaratonistas();
    }


}

