package com.example.corrida.Repository;

import com.example.corrida.Entity.Maratonista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaratonistaRepository extends JpaRepository<Maratonista, Long> {
}

