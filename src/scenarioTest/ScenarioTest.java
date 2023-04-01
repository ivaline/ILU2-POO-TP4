package scenarioTest;

import personnages.Gaulois;
import produit.Date;
import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.lEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		lEtal[] etals = new lEtal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		etals[0] = etalSanglier;
		//etals[0].occuperEtal(new Gaulois("Ordralfabétix", 12), new Poisson(12, "lundi"), 10);

	}
	
}
