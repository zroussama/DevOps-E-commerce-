package com.esprit.examen.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.esprit.examen.entities.Facture;
import com.esprit.examen.entities.Reglement;
import com.esprit.examen.repositories.FactureRepository;
import com.esprit.examen.repositories.ReglementRepository;

@Service
public class ReglementServiceImpl implements IReglementService {

	@Autowired
	FactureRepository factureRepository;
	@Autowired
	ReglementRepository reglementRepository;
	@Override
	public List<Reglement> retrieveAllReglements() {
		return (List<Reglement>) reglementRepository.findAll();
	}

	@Override
	public Reglement addReglement(Reglement r) {
        reglementRepository.save(r);
		return r;
	}

	@Override
	public Reglement retrieveReglement(Long id) {
		Reglement reglement = reglementRepository.findById(id).orElse(null);
		
		return reglement;
	}

	@Override
	public List<Reglement> retrieveReglementByFacture(Long idFacture) {
		List<Reglement> reglements= reglementRepository.retrieveReglementByFacture(idFacture);
		return reglements;
		
//		ou bien(Sans JPQL)
//		Facture f= factureRepository.findById(idFacture).get();
//		return (List<Reglement>) f.getReglements();
	}

	@Override
	public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate) {
		return reglementRepository.getChiffreAffaireEntreDeuxDate( startDate, endDate);
	}

}
