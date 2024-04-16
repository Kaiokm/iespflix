package com.projetoflix.iespflix.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private String genero;
    private int ano;
    private int duracao; //em minutos
}
