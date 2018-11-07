package fr.afang.business.pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.afang.bean.pizza;

public class pizzaBusiness {
	private int id;

	public ArrayList<pizza> getpizzas(){
		ArrayList<pizza> liste = new ArrayList<>();


		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3307/pizzeria", "root", "roots");
			Statement statement = cnx.createStatement();
			ResultSet resultat = statement.executeQuery("SELECT id,libelle,reference,prix,url_image FROM Pizza");

			while (resultat.next()) {
				Integer id = resultat.getInt("id");
				String libelle = resultat.getString("libelle");
				String reference = resultat.getString("reference");
				Integer prix = resultat.getInt("prix");
				String url = resultat.getString("url_image");

				pizza p = new pizza(id,libelle,reference,prix,url);
				liste.add(p);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} 

		return liste;

	}

	public void ajoutPizza(String libelle,String reference,Integer prix,String url) {	
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection connexion= DriverManager.getConnection("jdbc:mariadb://localhost:3307/pizzeria", "root", "roots");
			PreparedStatement ps = connexion.prepareStatement("INSERT INTO Pizza(libelle,reference,prix,url_image) VALUES(?,?,?,?)");

			ps.setString(1, libelle);
			ps.setString(2, reference);
			ps.setInt(3, prix);
			ps.setString(4, url);

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void modifierPizza(String libelle, String reference, Integer prix , String url, Integer id) {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3307/pizzeria", "root", "roots");

			PreparedStatement ps = cnx.prepareStatement("UPDATE pizza SET libelle = ?, reference = ?, prix = ?, url_image=? WHERE id = ?");
			ps.setString(1, libelle);
			ps.setString(2, reference);
			ps.setInt(3, prix);
			ps.setString(4, url);
			ps.setInt(5, id);

			ps.executeUpdate();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public pizza getPizzaById(Integer id) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3307/pizzeria", "root", "roots");
			PreparedStatement ps = cnx.prepareStatement("SELECT id,libelle, reference, prix, url_image FROM pizza WHERE id = ?");

			ps.setInt(1, id);
			ResultSet resultat = ps.executeQuery();
			while (resultat.next()) {
				Integer idBD = resultat.getInt("id");
				String libelle = resultat.getString("libelle");
				String ref = resultat.getString("reference");
				Integer prix = resultat.getInt("prix");
				String url = resultat.getString("url_image");

				pizza p = new pizza(idBD, libelle, ref, prix, url);
				return p;
			}

		}catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	public void supprimerPizza(Integer id) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3307/pizzeria", "root", "roots");
			PreparedStatement ps = cnx.prepareStatement("delete from pizza where id = ?");
			ps.setInt(1, id);
			ps.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}