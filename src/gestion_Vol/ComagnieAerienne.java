package gestion_Vol;

public class ComagnieAerienne {
	private int idCompagnie;
	private String nomComapgnie;
	
	public ComagnieAerienne(int idCompagnie, String nomComapgnie) {
		super();
		this.idCompagnie = idCompagnie;
		this.nomComapgnie = nomComapgnie;
	}

	public int getIdCompagnie() {
		return idCompagnie;
	}

	public void setIdCompagnie(int idCompagnie) {
		this.idCompagnie = idCompagnie;
	}

	public String getNomComapgnie() {
		return nomComapgnie;
	}

	public void setNomComapgnie(String nomComapgnie) {
		this.nomComapgnie = nomComapgnie;
	}

	@Override
	public String toString() {
		return "ComagnieAerienne [idCompagnie=" + idCompagnie + ", nomComapgnie=" + nomComapgnie + "]";
	} 
		
}
