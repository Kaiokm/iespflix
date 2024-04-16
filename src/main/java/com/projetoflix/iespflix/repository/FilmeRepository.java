package com.projetoflix.iespflix.repository;

import com.projetoflix.iespflix.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
