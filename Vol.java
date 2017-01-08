package gestion_Vol;

public class Vol {
	private static int idVol;
	private String dateDepart;
	private String dateArrive;
	private int heureArrive;
	private int heureDepart;
	
	public Vol(String dateDepart, String dateArrive, int heureArrive, int heureDepart) {
		super();
		Vol.idVol++;
		this.dateDepart = dateDepart;
		this.dateArrive = dateArrive;
		this.heureArrive = heureArrive;
		this.heureDepart = heureDepart;
	}
	public void ouvrirVol(String ordre){
		if(ordre == "ouvrir")
			System.out.println("Le vol est ouvert. Vous avez la permission d'effectuer un vol.");
		else 
			System.out.println(" Le vol est encore ferme. Vous n'avez pas la permission!");
	}
	public void fermerVol(String ordre){
		if(ordre == "fermer")
			System.out.println("Le vol est bien ferme.");
		else 
			System.out.println("Le vol est encore ouvert. Vous avez toujours la permission d'effectuer un vol");
	} 
	
	public int getIdVol() {
		return idVol;
	}

	public void setIdVol(int idVol) {
		Vol.idVol = idVol;
	}

	public String getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(String dateDepart) {
		this.dateDepart = dateDepart;
	}

	public String getDateArrive() {
		return dateArrive;
	}

	public void setDateArrive(String dateArrive) {
		this.dateArrive = dateArrive;
	}

	public int getHeureArrive() {
		return heureArrive;
	}

	public void setHeureArrive(int heureArrive) {
		this.heureArrive = heureArrive;
	}

	public int getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(int heureDepart) {
		this.heureDepart = heureDepart;
	}
	@Override
	public String toString() {
		return "Vol [dateDepart=" + dateDepart + ", dateArrive=" + dateArrive + ", heureArrive=" + heureArrive
				+ ", heureDepart=" + heureDepart + "]";
	}
	
}
