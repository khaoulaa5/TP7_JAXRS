package com.example.TP7_JAXRS.repositories;

import com.example.TP7_JAXRS.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
