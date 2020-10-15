package modele;

public class Produit {
	
	private String nom;
	private String description;
	private float tarif_u;
	private String categorie;
	
	public Produit(String nom, String description, float tarif_u, String categorie) {
		super();
		this.nom = nom;
		this.description = description;
		this.tarif_u = tarif_u;
		this.categorie = categorie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getTarif_u() {
		return tarif_u;
	}

	public void setTarif_u(float tarif_u) {
		this.tarif_u = tarif_u;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return nom+" ("+categorie+"), "+tarif_u+" euros";
	}
	
	

}
