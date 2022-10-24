package com.esprit.examen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.esprit.examen.entities.SecteurActivite;
import com.esprit.examen.services.ISecteurActiviteService;

import io.swagger.annotations.Api;

@RestController
@Api(tags = "Gestion des secteurs activites")
@RequestMapping("/secteurActivite")
@CrossOrigin("*")
public class SecteurActiviteController {

	@Autowired
	ISecteurActiviteService secteurActiviteService;
	
	// http://localhost:8089/SpringMVC/secteurActivite/retrieve-all-secteurActivite
	@GetMapping("/retrieve-all-secteurActivite")
	@ResponseBody
	public List<SecteurActivite> getSecteurActivite() {
		List<SecteurActivite> list = secteurActiviteService.retrieveAllSecteurActivite();
		return list;
	}

	// http://localhost:8089/SpringMVC/secteurActivite/retrieve-secteurActivite/8
	@GetMapping("/retrieve-secteurActivite/{secteurActivite-id}")
	@ResponseBody
	public SecteurActivite retrieveSecteurActivite(@PathVariable("secteurActivite-id") Long secteurActiviteId) {
		return secteurActiviteService.retrieveSecteurActivite(secteurActiviteId);
	}

	// http://localhost:8089/SpringMVC/secteurActivite/add-secteurActivite
	@PostMapping("/add-secteurActivite")
	@ResponseBody
	public SecteurActivite addSecteurActivite(@RequestBody SecteurActivite sa) {
		SecteurActivite secteurActivite = secteurActiviteService.addSecteurActivite(sa);
		return secteurActivite;
	}

	// http://localhost:8089/SpringMVC/secteurActivite/remove-secteurActivite/{secteurActivite-id}
	@DeleteMapping("/remove-secteurActivite/{secteurActivite-id}")
	@ResponseBody
	public void removeSecteurActivite(@PathVariable("secteurActivite-id") Long secteurActiviteId) {
		secteurActiviteService.deleteSecteurActivite(secteurActiviteId);
	}

	// http://localhost:8089/SpringMVC/secteurActivite/modify-secteurActivite
	@PutMapping("/modify-secteurActivite")
	@ResponseBody
	public SecteurActivite modifySecteurActivite(@RequestBody SecteurActivite secteurActivite) {
		return secteurActiviteService.updateSecteurActivite(secteurActivite);
	}

	
}
