package gestion_Vol;

public class Passager {
	private int idPassager;
	private String nomPassager;
	private String prenomPassager;
	private String email;
	
	public Passager(int idPassager, String nomPassager, String prenomPassager, String email) {
		super();
		this.idPassager = idPassager;
		this.nomPassager = nomPassager;
		this.prenomPassager = prenomPassager;
		this.email = email;
	}

	public int getIdPassager() {
		return idPassager;
	}

	public void setIdPassager(int idPassager) {
		this.idPassager = idPassager;
	}

	public String getNomPassager() {
		return nomPassager;
	}

	public void setNomPassager(String nomPassager) {
		this.nomPassager = nomPassager;
	}

	public String getPrenomPassager() {
		return prenomPassager;
	}

	public void setPrenomPassager(String prenomPassager) {
		this.prenomPassager = prenomPassager;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Passager [idPassager=" + idPassager + ", nomPassager=" + nomPassager + ", prenomPassager="
				+ prenomPassager + ", email=" + email + "]";
	}
	
}

