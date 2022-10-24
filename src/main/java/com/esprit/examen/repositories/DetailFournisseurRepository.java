package com.esprit.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.examen.entities.DetailFournisseur;

@Repository
public interface DetailFournisseurRepository  extends JpaRepository<DetailFournisseur, Long>{

}
