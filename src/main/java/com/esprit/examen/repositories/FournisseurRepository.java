package com.esprit.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.esprit.examen.entities.Fournisseur;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {

}
