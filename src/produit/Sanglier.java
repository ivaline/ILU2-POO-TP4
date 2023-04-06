package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private Gaulois chasseur;
	private int poids;
	
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier","kg");
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	public String getDesc() {
		return super.getName() + "  de " + this.poids + " kg chasse par " + this.chasseur.getNom();
	}
	
}
