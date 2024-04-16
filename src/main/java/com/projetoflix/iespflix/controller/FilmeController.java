package com.projetoflix.iespflix.controller;

import com.projetoflix.iespflix.model.Filme;
import com.projetoflix.iespflix.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/filme")
public class FilmeController {
    @Autowired
    private FilmeService filmeService;

    @PostMapping("/add")
    public ResponseEntity<Filme> addFilme(@RequestBody Filme filme) {
        Filme newFilme = filmeService.addFilme(filme);
        return ResponseEntity.ok(newFilme);
    }
}
