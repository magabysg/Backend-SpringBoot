package com.senai.music.entiny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Musica {

    @Id
    private int id;
    private String nomeMusica;
    private Genero genero;


}
