package gestion_Vol;
import java.sql.Date;
public class Vol {
	private int idVol;
	private java.sql.Date dateDepart;
	private java.sql.Date dateArrive;
	private String heureArrive;
	private String heureDepart;
	
	public Vol(int idVol,java.sql.Date dateDepart, java.sql.Date dateArrive, String heureDepart, String heureArrive) {
		this.idVol = idVol; 
		this.dateDepart = dateDepart;
		this.dateArrive = dateArrive;
		this.heureArrive = heureArrive;
		this.heureDepart = heureDepart;
	} 
	public boolean ouvrirVol(String ordre){
		if(ordre == "ouvrir"){
			System.out.println("Le vol est ouvert. Vous avez la permission d'effectuer un vol.");
			return true; 
		}
		else {
			System.out.println("Le vol est encore ferme. Vous n'avez pas la permission!");
			return false;
		}
	}
	public boolean fermerVol(String ordre){
		if(ordre == "fermer"){
			System.out.println("Le vol est bien ferme.");
			return true;
		}
		else{
			System.out.println("Le vol est encore ouvert. Vous avez toujours la permission d'effectuer un vol");
			return false;
		} 
	}
	
	public int getIdVol() {
		return idVol;
	}

	public void setIdVol(int idVol) {
		this.idVol = idVol;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(java.sql.Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public java.sql.Date getDateArrive() {
		return dateArrive;
	}

	public void setDateArrive(java.sql.Date dateArrive) {
		this.dateArrive = dateArrive;
	}

	public String getHeureArrive() {
		return this.heureArrive;
	}

	public void setHeureArrive(String heureArrive) {
		this.heureArrive = heureArrive;
	}

	public String getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(String heureDepart) {
		this.heureDepart = heureDepart;
	}
	@Override
	public String toString() {
		return "Vol [dateDepart=" + dateDepart + ", dateArrive=" + dateArrive + ", heureArrive=" + heureArrive
				+ ", heureDepart=" + heureDepart + "]";
	}
	
}
