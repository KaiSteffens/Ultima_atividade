package com.example.corrida.Repository;

import com.example.corrida.Entity.Inscricao;
import com.example.corrida.Entity.Maratonista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscricaoRepository extends JpaRepository<Inscricao, Long> {
}
