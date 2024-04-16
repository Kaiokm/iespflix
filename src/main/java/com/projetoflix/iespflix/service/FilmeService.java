package com.projetoflix.iespflix.service;

import com.projetoflix.iespflix.model.Filme;
import com.projetoflix.iespflix.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {
    @Autowired
    private FilmeRepository filmeRepository;

    public Filme addFilme(Filme filme) {
        return filmeRepository.save(filme);
    }
}
