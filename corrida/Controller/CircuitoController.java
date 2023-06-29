package com.example.corrida.Controller;

import com.example.corrida.Entity.Circuito;
import com.example.corrida.Entity.Inscricao;
import com.example.corrida.Entity.Maratonista;
import com.example.corrida.Service.CircuitoService;
import com.example.corrida.Service.MaratonistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sistema")
public class CircuitoController {

    @Autowired
    private CircuitoService circuitoService;

    @PostMapping("circuito")
    public ResponseEntity<Circuito> salvarCircuito(@RequestBody Circuito circuito) {
        return ResponseEntity.status(HttpStatus.CREATED).body(circuitoService.SalvarCircuito(circuito));

    }

    @GetMapping("circuito/{id}")
    public Circuito buscarcircuitoPorId(@PathVariable long id) {
        return circuitoService.buscarCircuito(id);


    }

    @GetMapping("circuitos")
    public List<Circuito> ListarCircuito() {
        return circuitoService.listarCircuitos();
    }
}


