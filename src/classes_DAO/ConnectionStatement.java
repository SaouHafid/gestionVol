package classes_DAO;

import java.sql.DriverManager;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;

import java.sql.Connection;
import java.sql.Statement;

public class ConnectionStatement{
	
	private Connection connection = null;
	private Statement statement = null;
	
	public ConnectionStatement(){	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost/gestionvol","root","");
		this.statement = connection.createStatement();
	}catch(Exception e){
		System.out.println("Erreur: "+e);
	}
}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}
	
}


