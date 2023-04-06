package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.DepenseMarchand;
import villagegaulois.Etal;
import villagegaulois.IEtal;
import villagegaulois.IVillage;

public class Scenario {

	public static void main(String[] args) {

		IVillage village = new IVillage(){
			IEtal [] marche= new IEtal[3];
			int delem = 0;
			@Override
			public <P extends Produit> boolean installerVendeur(Etal<P> etal, Gaulois vendeur, P[] produit, int prix) {
				if (delem<marche.length) {
					etal.installerVendeur(vendeur, produit, prix);
					marche[delem] = etal;
					++delem;
					return true;
				}
				return false;
			}

			@Override
			public DepenseMarchand[] acheterProduit(String produit, int quantiteSouhaitee) {
				int nbEtals = marche.length-1;
				DepenseMarchand[] marchands = new DepenseMarchand[nbEtals+1];
				int nbMarchand = 0;
				while(quantiteSouhaitee>0 && nbEtals>=0) {
					int produits;
					produits = marche[nbEtals].contientProduit(produit, quantiteSouhaitee);
					if (produits!=0) {
						quantiteSouhaitee-=produits;
						marchands[nbMarchand] = new DepenseMarchand(marche[nbEtals].getVendeur(), produits, produit, marche[nbEtals].acheterProduit(produits));
						nbMarchand++;
					}
					nbEtals--;
				}
				return marchands;
			}
			
			@Override
			public String toString() {
				StringBuilder ugoSucks = new StringBuilder();
				int ugoSucks2 = marche.length-1; 
				while(ugoSucks2>=0) {
					ugoSucks.append(marche[ugoSucks2].etatEtal());
					ugoSucks2--;
				}
				return ugoSucks.toString();
			}
			
		};


		Gaulois ordralfabetix = new Gaulois("Ordralfabétix", 9);
		Gaulois obelix = new Gaulois("Obélix", 20);
		Gaulois asterix = new Gaulois("Astérix", 6);

		Etal<Sanglier> etalSanglierObelix = new Etal<>();
		Etal<Sanglier> etalSanglierAsterix = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();

		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);

		Sanglier[] sangliersObelix = { sanglier1, sanglier2 };
		Sanglier[] sangliersAsterix = { sanglier3, sanglier4 };

		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = { poisson1 };

		village.installerVendeur(etalSanglierAsterix, asterix, sangliersAsterix, 10);
		village.installerVendeur(etalSanglierObelix, obelix, sangliersObelix, 8);
		village.installerVendeur(etalPoisson, ordralfabetix, poissons, 5);

		System.out.println(village);

		DepenseMarchand[] depense = village.acheterProduit("sanglier", 3);

		for (int i = 0; i < depense.length && depense[i] != null; i++) {
			System.out.println(depense[i]);
		}

		System.out.println(village);

	}

}
