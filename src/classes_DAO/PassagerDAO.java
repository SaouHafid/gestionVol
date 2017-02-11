package classes_DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import gestion_Vol.Passager;
import gestion_Vol.Vol;

public class PassagerDAO extends ConnectionStatement{
	private Statement statement = null;
	private PreparedStatement preparedStatement = null; 
	private ResultSet resultSet = null;
	private int idPassager;
	private String nomPassager;
	private String prenomPassager;
	private String email;
	
	public void getPassager(){
		try{
		statement = this.getStatement();
		this.resultSet = statement.executeQuery("SELECT * FROM passager");
		while(resultSet.next()){
			this.idPassager = resultSet.getInt("idPassager");
			this.nomPassager = resultSet.getString("nomPassager");
			this.prenomPassager = resultSet.getString("prenomPassager");
			this.email = resultSet.getString("email");
			
			System.out.println("idPassager: "+idPassager);
			System.out.println("nom du Passager: "+nomPassager);
			System.out.println("prenom du Passager: "+prenomPassager);
			System.out.println("email: "+email);
		}
		}catch(SQLException e){
			System.out.println("Erreur :"+e);
		}
	}

	public void addPassager(Passager passager) {
		
		String sql = "insert into passager values("+passager.getIdPassager()+","+"'"+passager.getNomPassager()
		+","+"'"+passager.getPrenomPassager()+","+"'"+passager.getEmail()+")";
		try{
			preparedStatement = this.getConnection().prepareStatement(sql);
			System.out.println("Le nouveau Passager est bien ajouté a la table passager.");
		}catch(SQLException e){
			System.out.println("Erreur: "+e);
		}
		
	}

	public void updatePassager(Passager passager){
		try{
		preparedStatement = this.getConnection().prepareStatement("INSERT INTO passager values(?,?,?,?,?)");
		preparedStatement.setInt(1, passager.getIdPassager());
		preparedStatement.setString(2, passager.getNomPassager());
		preparedStatement.setString(3, passager.getPrenomPassager());
		preparedStatement.setString(4, passager.getEmail());
		preparedStatement.executeUpdate();
		System.out.println("Le passager numero:"+passager.getIdPassager()+" a eu un mis à jour correctement.");
		}catch(SQLException e){
			System.out.println("Erreur: "+e);
		}
	}
	public void deletePassager(int idPassager) {
		
		String sql = "DELETE FROM passager WHERE idPassager="+idPassager;
		try{
			preparedStatement = this.getConnection().prepareStatement(sql);
			System.out.println("Le vol numero: "+idPassager+"a été supprimé correctement de la table passager.");
		}catch(SQLException e){
			System.out.println("Erreur: "+e); 
		}
		
	}
}
