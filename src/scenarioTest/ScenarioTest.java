package scenarioTest;

import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.lEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		//lEtal<Produit>[] marche = new lEtal[3];
		lEtal[] marche = new lEtal[3];
		lEtal<Sanglier> etalSanglier = new Etal<>();
		lEtal<Poisson> etalPoisson = new Etal<>();
		marche[0] = etalSanglier;
		marche[1] = etalPoisson;
	}
	
}
