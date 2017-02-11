package classes_DAO;

import java.sql.*;

import gestion_Vol.Escale;

public class EscaleDAO extends ConnectionStatement {
	private Statement statement = null;
	private PreparedStatement preparedStatement = null; 
	private ResultSet resultSet = null;
	private int numEscale;
	private int heureDepartEscale;
	private int minuteDepartEscale;
	private int minuteArriveEscale;
	private int heureArriveEscale;
	
	public void getEscale(){
		try{
		statement = this.getStatement();
		this.resultSet = statement.executeQuery("SELECT * FROM escale");
		while(resultSet.next()){
			this.numEscale = resultSet.getInt("numEscale");
			this.heureArriveEscale = resultSet.getInt("heureArriveEscale");
			this.heureDepartEscale = resultSet.getInt("heureDepartEscale");
			this.minuteArriveEscale = resultSet.getInt("minuteArriveEscale");
			this.minuteDepartEscale = resultSet.getInt("minuteDepartEscale");
			
			System.out.println("numero d'escale: "+numEscale);
			System.out.println("heure d'arrive d'Escale: "+heureArriveEscale);
			System.out.println("heure de depart d'escale: "+heureDepartEscale);
			System.out.println("minute d'arrive d'escale: "+minuteArriveEscale);
			System.out.println("minute de depart d'escale: "+minuteDepartEscale);
		}
		}catch(SQLException e){
			System.out.println("Erreur :"+e);
		}
	}

	public void addEscale(Escale escale) {
		
		String sql = "insert into vol values("+escale.getNumEscale()+","+"'"+escale.getHeureDepartEscale()
		+","+"'"+escale.getHeureArriveEscale()+","+"'"+escale.getMinuteDepartEscale()+","+"'"+escale.getMinuteArriveEscale()+")";
		try{
			preparedStatement = this.getConnection().prepareStatement(sql);
			System.out.println("Le nouveau Escale est bien ajouté a la table escale.");
		}catch(SQLException e){
			System.out.println("Erreur: "+e);
		}
		
	}

	public void updateEscale(Escale escale){
		try{
		preparedStatement = this.getConnection().prepareStatement("INSERT INTO escale values(?,?,?,?,?)");
		preparedStatement.setInt(1, escale.getNumEscale());
		preparedStatement.setInt(2, escale.getHeureDepartEscale());
		preparedStatement.setInt(3, escale.getHeureArriveEscale());
		preparedStatement.setInt(4, escale.getMinuteDepartEscale());
		preparedStatement.setInt(5, escale.getMinuteArriveEscale());
		preparedStatement.executeUpdate();
		System.out.println("L'escale numero:"+escale.getNumEscale()+" a eu un mis à jour correctement.");
		}catch(SQLException e){
			System.out.println("Erreur: "+e);
		}
	}
	public void deleteEscale(int numEscale) {
		
		String sql = "DELETE FROM escale WHERE numEscale="+numEscale;
		try{
			preparedStatement = this.getConnection().prepareStatement(sql);
			System.out.println("Le vol numero: "+numEscale+"a été supprimé correctement de la table vol.");
		}catch(SQLException e){
			System.out.println("Erreur: "+e); 
		}
		
	}
}
