package classes_DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import gestion_Vol.Vol;

public class volDAO extends ConnectionStatement{
	private Statement statement = null;
	private PreparedStatement preparedStatement = null; 
	private ResultSet resultSet = null;
	private int idVol;
	private java.sql.Date dateArrivee;
	private java.sql.Date dateDepart;
	private String heureArrivee;
	private String heureDepart;
	
	public void getVol(){
		try{
		statement = this.getStatement();
		this.resultSet = statement.executeQuery("SELECT * FROM vol");
		while(resultSet.next()){
			this.idVol = resultSet.getInt("idVol");
			this.dateArrivee = resultSet.getDate("dateArrivee");
			this.dateDepart = resultSet.getDate("dateDepart");
			this.heureArrivee = resultSet.getString("heureArrivee");
			this.heureDepart = resultSet.getString("heureDepart");
			
			System.out.println("idVol: "+idVol);
			System.out.println("date d'arrivee: "+dateArrivee);
			System.out.println("date de depart: "+dateDepart);
			System.out.println("heure d'arrivee: "+heureArrivee);
			System.out.println("heure de depart: "+heureDepart);
		}
		}catch(SQLException e){
			System.out.println("Erreur :"+e);
		}
	}

	public void addVol(Vol vol) {
		
		String sql = "insert into vol values("+"'"+vol.getIdVol()+"'"+","+"'"+vol.getDateDepart()
		+"'"+","+"'"+vol.getDateArrive()+"'"+","+"'"+vol.getHeureDepart()+"'"+","+"'"+vol.getHeureArrive()+"'"+")";
		try{
			preparedStatement = this.getConnection().prepareStatement(sql);
			preparedStatement.executeUpdate();
			System.out.println("Le nouveau Vol est bien ajouté a la table vol.");
		}catch(SQLException e){
			System.out.println("Erreur: "+e);
		}
		
	}

	public void updateVol(Vol vol){
		try{
		preparedStatement = this.getConnection().prepareStatement("INSERT INTO vol values(?,?,?,?,?)");
		preparedStatement.setInt(1, vol.getIdVol());
		preparedStatement.setDate(2, vol.getDateDepart());
		preparedStatement.setDate(3, vol.getDateArrive());
		preparedStatement.setString(4, vol.getHeureDepart());
		preparedStatement.setString(5, vol.getHeureArrive());
		preparedStatement.executeUpdate();
		System.out.println("Le vol numero:"+vol.getIdVol()+" a eu un mis à jour correctement.");
		}catch(SQLException e){
			System.out.println("Erreur: "+e);
		}
	}
	public void deleteVol(int idVol) {
		
		String sql = "DELETE FROM vol WHERE idVol="+idVol;
		try{
			preparedStatement = this.getConnection().prepareStatement(sql);
			System.out.println("Le vol numero: "+idVol+"a été supprimé correctement de la table vol.");
		}catch(SQLException e){
			System.out.println("Erreur: "+e); 
		}
		
	}
	
}
