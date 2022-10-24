package com.esprit.examen.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esprit.examen.entities.Operateur;

@Repository
public interface OperateurRepository extends CrudRepository<Operateur, Long> {

}
