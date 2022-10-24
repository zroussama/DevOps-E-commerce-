/*package com.esprit.examen.services;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.examen.entities.CategorieClient;
import com.esprit.examen.entities.Client;
import com.esprit.examen.entities.Profession;

import lombok.extern.slf4j.Slf4j;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ClientServiceImplTest {
	@Autowired
	IClientService clientService;

	
	@Test
	public void testAddClient() throws ParseException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dateNaissance = dateFormat.parse("30/09/2000");
		Client c = new Client("Salhi", "Ahmed", dateNaissance, "ahmed.salhi@esprit.tn", "pwd", Profession.Cadre,
				CategorieClient.Ordinaire);
		Client client = clientService.addClient(c);
		System.out.print("client "+client);
		assertNotNull(client.getIdClient());
		assertNotNull(client.getCategorieClient());
		assertTrue(client.getNom().length() > 0);
		clientService.deleteClient(client.getIdClient());

	}
	@Test
	public void testDeleteClient() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dateNaissance = dateFormat.parse("30/09/2000");
		Client c = new Client("Salhi", "Ahmed", dateNaissance, "ahmed.salhi@esprit.tn", "pwd", Profession.Cadre,
				CategorieClient.Ordinaire);
		Client client = clientService.addClient(c);
		clientService.deleteClient(client.getIdClient());
		assertNull(clientService.retrieveClient(client.getIdClient()));
	}

	@Test
	public void testRetrieveAllClients() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dateNaissance = dateFormat.parse("30/09/2000");
		List<Client> clients = clientService.retrieveAllClients();
		int expected = clients.size();
		Client c = new Client("Salhi", "Ahmed", dateNaissance, "ahmed.salhi@esprit.tn", "pwd", Profession.Cadre,
				CategorieClient.Ordinaire);
		Client client = clientService.addClient(c);
		assertEquals(expected + 1, clientService.retrieveAllClients().size());
		clientService.deleteClient(client.getIdClient());

	}
	@Test
	public void testGetClientsByDateNaissance() throws ParseException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date startDate = dateFormat.parse("28/09/2000");
		Date endDate = dateFormat.parse("30/09/2005");
		List<Client> clients = clientService.getClientsByDateNaissance(startDate, endDate);
		log.info(" count" + clients.size());
		for (Client client : clients) {
			log.info(" client : " + client.getNom()+ " né le "+client.getDateNaissance());

		}
	}

}
*/