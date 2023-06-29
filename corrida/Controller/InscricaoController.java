package com.example.corrida.Controller;

import com.example.corrida.Entity.Inscricao;
import com.example.corrida.Entity.Maratonista;
import com.example.corrida.Service.InscricaoService;
import com.example.corrida.Service.MaratonistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sistema")
public class InscricaoController {

    @Autowired
    private InscricaoService inscricaoService;

    @PostMapping("inscricao")
    public ResponseEntity<Inscricao> salvarInscricao(@RequestBody Inscricao inscricao) {
        return ResponseEntity.status(HttpStatus.CREATED).body(inscricaoService.SalvarInscricao(inscricao));
    }

    @GetMapping("inscricao/{id}")
    public Inscricao buscarInscricaoPorId(@PathVariable long id) {
        return inscricaoService.buscarInscricao(id);


    }

    @GetMapping("inscricaos")
    public List<Inscricao> ListarInscricao() {
        return inscricaoService.listarinscricao();
    }
}



