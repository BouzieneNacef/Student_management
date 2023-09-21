package Etudiant;

public class Etudiant {
	
	/* declaration des att */
	private int id;
	private String nom;
	private String prenom;
	
	/*constractor 1 */
	public Etudiant() {}
	
	/*constractor 2 */
	public Etudiant(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	/* getter and setter */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	} 
	
	/* equals methode */
    public boolean equals(Object obj) {  
		if(obj instanceof Etudiant) 
			return true;
		Etudiant other=(Etudiant)obj;
		if(this.id==other.id) 
			return true;
		else 
			return false;
	}
    /* string to string methode */
	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

}
