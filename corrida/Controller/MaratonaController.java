package com.example.corrida.Controller;

import com.example.corrida.Entity.Inscricao;
import com.example.corrida.Entity.Maratona;
import com.example.corrida.Entity.Maratonista;
import com.example.corrida.Service.MaratonaService;
import com.example.corrida.Service.MaratonistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sistema")

public class MaratonaController {

    @Autowired
    private MaratonaService maratonaService;

    @PostMapping("maratona")
    public ResponseEntity<Maratona> salvarMaratona(@RequestBody Maratona maratona) {
        return ResponseEntity.status(HttpStatus.CREATED).body(maratonaService.salvarMaratona(maratona));

    }

    @GetMapping("maratona/{id}")
    public Maratona buscarMaratonaPorId(@PathVariable long id) {
        return maratonaService.buscarMaratona(id);


    }

    @GetMapping("maratonas")
    public List<Maratona> Listarmaratonas() {
        return maratonaService.listarMaratonas();
    }



}


