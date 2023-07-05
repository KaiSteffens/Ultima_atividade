package com.example.corrida.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Maratonista {
    @Id
    private long id;
    private String nome;
    private String sobrenome;
    private int idade;
    private String numeroCelular;
    private String numeroEmergencia;
    private String rg;
    private String grupoSanguineo;


  @OneToMany(mappedBy = "maratonista")

   private List<Inscricao> inscricaos;

}
