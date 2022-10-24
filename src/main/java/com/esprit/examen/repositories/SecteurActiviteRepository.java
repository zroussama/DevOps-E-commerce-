package com.esprit.examen.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esprit.examen.entities.SecteurActivite;

@Repository
public interface SecteurActiviteRepository extends CrudRepository<SecteurActivite, Long> {

}
