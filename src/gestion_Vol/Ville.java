package gestion_Vol;

public class Ville {
	private int idVille;
	private String nomVille;
	
	public Ville(int idVille, String nomVille) {
		super();
		this.idVille = idVille;
		this.nomVille = nomVille;
	}

	public int getIdVille() {
		return idVille;
	}

	public void setIdVille(int idVille) {
		this.idVille = idVille;
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	@Override
	public String toString() {
		return "Ville [idVille=" + idVille + ", nomVille=" + nomVille + "]";
	}
	
	
}
