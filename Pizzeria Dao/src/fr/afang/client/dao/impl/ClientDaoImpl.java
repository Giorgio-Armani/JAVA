package fr.afang.client.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.afang.client.dao.IClientDao;
import fr.afang.client.domain.Client;

public class ClientDaoImpl implements IClientDao {

	@Override
	public List<Client> findAll() {
		List<Client> liste = new ArrayList<>();

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3307/pizzeria", "root", "roots");
			Statement statement = cnx.createStatement();
			ResultSet resultat = statement.executeQuery("SELECT * FROM Client");

			while (resultat.next()) {
			Integer id = resultat.getInt("id");
			String nom = resultat.getString("nom");
			String prenom = resultat.getString("prenom");
			String email = resultat.getString("email");
			String dateNaissance = resultat.getString("date_naissance");
			String numTelephone = resultat.getString("tel_fixe");
			String portable = resultat.getString("tel_portable");
			Integer numClient = resultat.getInt("num_client");
			String adresse = resultat.getString("adress");



				Client c = new Client(id, numClient, nom, prenom, numTelephone, portable, dateNaissance, email, adresse);
				liste.add(c);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} 

		return liste;	}

	@Override
	public Client findByid(Integer id) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3307/pizzeria", "root", "roots");
			Statement statement = cnx.createStatement();
			PreparedStatement ps = cnx.prepareStatement("SELECT * FROM Client WHERE id=?");
			ps.setInt(1, id);
			ResultSet resultat = ps.executeQuery();
			while (resultat.next()) {
			Integer Id = resultat.getInt("id");
			String nom = resultat.getString("nom");
			String prenom = resultat.getString("prenom");
			String email = resultat.getString("email");
			String dateNaissance = resultat.getString("date_naissance");
			String numTelephone = resultat.getString("tel_fixe");
			String portable = resultat.getString("tel_portable");
			Integer numClient = resultat.getInt("num_client");
			String adresse = resultat.getString("adress");



				Client c = new Client(id, numClient, nom, prenom, numTelephone, portable, dateNaissance, email, adresse);
				return c;

			}

		} catch (Exception e) {
			e.printStackTrace();
		} 
				
		return null;
	}

	@Override
	public void ajoutclient(String nom, String prenom, String adresse, String tel_fixe, String tel_portable,
			Integer num_client, String email, String date_naissance) {
	try {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection connexion= DriverManager.getConnection("jdbc:mariadb://localhost:3307/pizzeria", "root", "roots");
		PreparedStatement ps = connexion.prepareStatement("INSERT INTO CLIENT(num_client, nom,prenom,tel_fixe,tel_portable,date_naissance,email,adress) VALUES(?,?,?,?,?,?,?,?)");

		
		ps.setInt(1, num_client);
		ps.setString(2, nom);
		ps.setString(3, prenom);
		ps.setString(4, tel_fixe);
		ps.setString(5, tel_portable);
		ps.setString(6, date_naissance);
		ps.setString(7, email);
		ps.setString(8, adresse);
	

		ps.executeUpdate();

	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
	@Override
	public void modifierclient(String nom, String prenom, String adresse, String tel_fixe, String tel_portable,
			Integer num_client, String email, String date_naissance, Integer id) {
	try {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3307/pizzeria", "root", "roots");

		PreparedStatement ps = cnx.prepareStatement("UPDATE client SET num_client = ?, nom = ?, prenom = ?, tel_fixe=?,tel_portable = ?,date_naissance = ?, email = ?,adress =? WHERE id = ?");
		ps.setInt(1, num_client);
		ps.setString(2, nom);
		ps.setString(3, prenom);
		ps.setString(4, tel_fixe);
		ps.setString(5, tel_portable);
		ps.setString(6, date_naissance);
		ps.setString(7, email);
		ps.setString(8, adresse);
		ps.setInt(9, id);

		ps.executeUpdate();


	} catch (Exception e) {
		e.printStackTrace();
	}
}

}
	