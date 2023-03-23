package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private Gaulois chasseur;
	private int poids;
	
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier",Unite.kilogramme);
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	public String getDesc() {
		return "sanglier" + " " + Unite.kilogramme + " " + poids+ " " + chasseur;
	}
	
}
