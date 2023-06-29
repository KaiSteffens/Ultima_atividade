package com.example.corrida.Entity;

import com.example.corrida.Entity.Enum.Categorias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Circuito {
     @Id

    private long id;
    private Categorias categorias;
    private String distancia;
    @JsonIgnore
@OneToMany (mappedBy = "circuito")
   private List<Inscricao> inscricao;


@ManyToOne
    private Maratona maratona;
}
