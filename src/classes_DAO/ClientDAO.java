package classes_DAO;

import java.sql.*;

import gestion_Vol.Client;

	public class ClientDAO extends ConnectionStatement {
		private Statement statement = null;
		private PreparedStatement preparedStatement = null; 
		private ResultSet resultSet = null;
		private int idClient;
		private String nomClient;
		private String prenomClient;
		
		
		public void getClient(){
			try{
			statement = this.getStatement();
			this.resultSet = statement.executeQuery("SELECT * FROM client");
			while(resultSet.next()){
				this.idClient = resultSet.getInt("idClient");
				this.nomClient = resultSet.getString("nomClient");
				this.prenomClient = resultSet.getString("prenomClient");
				
				System.out.println("numero de Client: "+idClient);
				System.out.println("nom du Client: "+nomClient);
				System.out.println("prenom du Client: "+prenomClient);
			}
			}catch(SQLException e){
				System.out.println("Erreur :"+e);
			}
		}

		public void addClient(Client client) {
			
			String sql = "insert into client values("+"'"+client.getIdClient()+"'"+","+"'"+client.getNomClient()
			+"'"+","+"'"+client.getPrenomClient()+"'"+")";
			try{
				preparedStatement = this.getConnection().prepareStatement(sql);
				preparedStatement.executeUpdate();
				System.out.println("Le nouveau Client est bien ajouté a la table client.");
			}catch(SQLException e){
				System.out.println("Erreur: "+e);
			}
			
		}

		public void updateClient(Client client){
			try{
			preparedStatement = this.getConnection().prepareStatement("INSERT INTO escale values(?,?,?,?,?)");
			preparedStatement.setInt(1, client.getIdClient());
			preparedStatement.setString(2, client.getNomClient());
			preparedStatement.setString(3, client.getPrenomClient());
			preparedStatement.executeUpdate();
			System.out.println("Le client numero:"+client.getIdClient()+" a eu un mis à jour correctement.");
			}catch(SQLException e){
				System.out.println("Erreur: "+e);
			}
		}
		public void deleteClient(int idClient) {
			
			String sql = "DELETE FROM client WHERE idClient="+idClient;
			try{
				preparedStatement = this.getConnection().prepareStatement(sql);
				preparedStatement.executeUpdate();
				System.out.println("Le client numero: "+idClient+"a été supprimé correctement de la table client.");
			}catch(SQLException e){
				System.out.println("Erreur: "+e); 
			}
		}
}

