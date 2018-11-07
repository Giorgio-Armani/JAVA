package fr.afang.client.dao;

import java.util.List;

import fr.afang.client.domain.Client;

public interface IClientDao {
	
	public List<Client>findAll();
	public Client findByid(Integer id);
	public void ajoutclient(String nom, String prenom,String adresse, String tel_fixe, String tel_portable,
			Integer num_client, String email, String date_naissance);
	public void modifierclient(String nom, String prenom,String adresse, String tel_fixe, String tel_portable,
			Integer num_client, String email, String date_naissance, Integer id);
}
