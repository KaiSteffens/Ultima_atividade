package com.example.corrida.Repository;

import com.example.corrida.Entity.Maratona;
import com.example.corrida.Entity.Maratonista;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface MaratonaRepository extends JpaRepository<Maratona, Long> {
}
