package villagegaulois;
import personnages.Gaulois;
import produit.IProduit;

public class Etal<P extends IProduit> implements IEtal{
	Gaulois vendeur;
	P[] produits;
	int nbProduit;
	int prix;
	public void installerVendeur(Gaulois vendeur, P[] produits, int prix){
		this.vendeur = vendeur;
		this.nbProduit = produits.length;
		this.produits = produits;
		this.prix = prix;
	}
	@Override
	public Gaulois getVendeur() {
		return this.vendeur;	 
	}
	@Override
	public double donnerPrix() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int contientProduit(String produit, int quantiteSouhaitee) {
		int quantiteAVendre = 0;
		if (nbProduit != 0 && this.produits[0].getName().equals(produit)) {
		if (nbProduit >= quantiteSouhaitee) {
			quantiteAVendre = quantiteSouhaitee;
		} else {
			quantiteAVendre = nbProduit;
			}
		}
		return quantiteAVendre;
	}
	@Override
	public double acheterProduit(int quantiteSouhaite) {
		double prixPaye = 0;
		for (int i = nbProduit - 1; i > nbProduit - quantiteSouhaite - 1 || i > 1; i--) {
			prixPaye += produits[i].calculerPrix(prix);
		}
		if (nbProduit >= quantiteSouhaite) {
			nbProduit -= quantiteSouhaite;
		} else {
			nbProduit = 0;
		}
		return prixPaye;
	}
	@Override
	public String etatEtal() {
		StringBuilder chaine = new StringBuilder(vendeur.getNom());
		if (nbProduit > 0) {
			chaine.append(" vend ");
			chaine.append(nbProduit + " produits :");
		for (int i = 0; i < nbProduit; i++) {
			chaine.append("\n- " + produits[i].getDesc());
		}
		} else {
			chaine.append(" n'a plus rien à vendre.");
		}
		chaine.append("\n");
		return chaine.toString();
	}
}
