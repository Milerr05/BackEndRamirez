package com.Milena.Ramirez.Repository;

import com.Milena.Ramirez.Entity.Hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RHyS extends JpaRepository<Hys, Integer>{
    Optional<Hys> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
