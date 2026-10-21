package com.senai.music.entiny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity //Entity transforma em uma tabela do Banco de Dados
public class Artista {

    @Id //Diz que o ID é a chave primaria
    private int id;
    private String nome;
    private String estilo;

}
