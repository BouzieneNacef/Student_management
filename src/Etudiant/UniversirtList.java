package Etudiant;

import java.util.ArrayList;
import java.util.List;

public class UniversirtList implements University {

	public void ajouterEtudiant(Etudiant e) {
		List<Etudiant> l = new ArrayList<Etudiant>();
		l.add(e);
		
	}
	public boolean rechercherEtudiant(Etudiant e) {
		List<Etudiant> l = new ArrayList<Etudiant>();
		return l.contains(e);
	}
	public boolean rechercherEtudiant(String nom) {
		List<Etudiant> l = new ArrayList<Etudiant>();
		for(Etudiant e: List ) {
			if(!e.getNom().equals(nom))
				return false;
		};
	}
	public void supprimerEtudiant(Etudiant e) {
		List<Etudiant> l = new ArrayList<Etudiant>();
		l.remove(e);
	}
	public void displayEtudiants() {
		List<Etudiant> l = new ArrayList<Etudiant>();
		l.toString();
	}
	public void trierEtudiantsParId() {
		List<Etudiant> l = new ArrayList<Etudiant>();
		l.sort(e.id);
	}
	public void trierEtudiantsParNom() {
		List<Etudiant> l = new ArrayList<Etudiant>();
		l.sort(e.nom);;
	}
	
}
