package com.esprit.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.esprit.examen.entities.CategorieProduit;

@Repository
public interface CategorieProduitRepository extends JpaRepository<CategorieProduit, Long>{

}
