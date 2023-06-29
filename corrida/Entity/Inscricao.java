package com.example.corrida.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Inscricao {

    @Id

    private long id;
    private String valorInscricao;

@JsonIgnore
   @ManyToOne
  private Maratonista maratonista;
    @ManyToOne
    private Circuito circuito;

}
