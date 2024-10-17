package com.softweek.softweek.domain.repository;

import com.softweek.softweek.domain.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Categoriarepository extends JpaRepository<Categoria, Long> {
}
