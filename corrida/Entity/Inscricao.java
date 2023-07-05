package com.example.corrida.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Inscricao {

    @Id

    private long id;
    private Double valorInscricao;

@JsonIgnore
   @ManyToOne
  private Maratonista maratonista;
    @ManyToOne
    private Circuito circuito;

}
