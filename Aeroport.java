package gestion_Vol;

public class Aeroport {
	
	private int idAeroport;
	private String nomAeroport;
	
	public Aeroport(int idAeroport, String nomAeroport) {
		super();
		this.idAeroport = idAeroport;
		this.nomAeroport = nomAeroport;
	}

	public int getIdAeroport() {
		return idAeroport; 
	}

	public void setIdAeroport(int idAeroport) {
		this.idAeroport = idAeroport;
	}

	public String getNomAeroport() {
		return nomAeroport;
	}

	public void setNomAeroport(String nomAeroport) {
		this.nomAeroport = nomAeroport;
	}

	@Override
	public String toString() {
		return "Aeroport [idAeroport=" + idAeroport + ", nomAeroport=" + nomAeroport + "]";
	}
	
}
