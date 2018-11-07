package fr.afang.client.business.impl;

import java.util.List;

import fr.afang.client.business.IClientBusiness;
import fr.afang.client.dao.IClientDao;
import fr.afang.client.dao.impl.ClientDaoImpl;
import fr.afang.client.domain.Client;

public class ClientBusinessImpl implements IClientBusiness{
	private IClientDao clientDao = new ClientDaoImpl();

	@Override
	public List<Client> findAll() {
		List<Client> clients = clientDao.findAll();
		return clients;
	}

	@Override
	public Client findByid(Integer id) {
		Client client = clientDao.findByid(id);
		return client;
	}

	@Override
	public void ajoutclient(String nom, String prenom,String adresse, String tel_fixe, String tel_portable,
			Integer num_client, String email, String date_naissance) {
		clientDao.ajoutclient(nom, prenom, adresse, tel_fixe, tel_portable, num_client, email, date_naissance);
	}

	@Override
	public void modifierclient(String nom, String prenom, String adresse, String tel_fixe, String tel_portable,
			Integer num_client, String email, String date_naissance,Integer id) {
		clientDao.modifierclient(nom, prenom, adresse, tel_fixe, tel_portable, num_client, email, date_naissance,id);
		
	}
	
	
}
