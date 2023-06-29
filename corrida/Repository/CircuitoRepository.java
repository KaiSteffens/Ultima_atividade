package com.example.corrida.Repository;

import com.example.corrida.Entity.Circuito;
import com.example.corrida.Entity.Maratonista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CircuitoRepository extends JpaRepository<Circuito, Long> {
}
