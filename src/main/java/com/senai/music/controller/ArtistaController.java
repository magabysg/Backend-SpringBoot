package com.senai.music.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistaController {

    @GetMapping("artista")

    public String tocarArtista(){
        return "Enhypen";
    }
}
