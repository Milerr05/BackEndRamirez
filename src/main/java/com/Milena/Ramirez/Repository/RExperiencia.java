package com.Milena.Ramirez.Repository;

import com.Milena.Ramirez.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Long> {
    Optional<Experiencia> findByNombreE(String nombreE);

    public Optional<Experiencia> findById(int id);

    public void deleteById(int id);

    public boolean existsById(int id);

    public boolean existsByNombreE(String nombreE);
}

