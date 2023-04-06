package scenarioTest;

import personnages.Gaulois;
import produit.Date;
import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		Etal<Sanglier> etalSanglier = new Etal<>();
		//etals[0] = etalSanglier;
		//etals[0].occuperEtal(new Gaulois("Ordralfabétix", 12), new Poisson(12, "lundi"), 10);
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
		
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
	
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};
		
		Etal<Sanglier> etalS1 = new Etal<>();
		Etal<Sanglier> etalS2 = new Etal<>();
		Etal<Poisson> etalP1 = new Etal<>();
		
		
		IEtal[] marche = new IEtal[3];
		marche[0] = etalS1;
		marche[1] = etalS2;
		marche[2] = etalP1;
		
		etalS1.installerVendeur(obelix, sangliersObelix, 8);
		etalS2.installerVendeur(asterix, sangliersAsterix, 10);
		etalP1.installerVendeur(ordralfabetix, poissons, 7);
		
		System.out.println(etalS1.etatEtal());
		System.out.println(etalS2.etatEtal());
		System.out.println(etalP1.etatEtal());
	}
	
}
