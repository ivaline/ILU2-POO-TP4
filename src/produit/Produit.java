package produit;


public abstract class Produit implements IProduit {
	private String name;
	private String unite;
	
	public Produit(String name, String unite) {
		this.name = name;
		this.unite = unite;
	}
	

	@Override
	public String getName() {
		return name;
	}
	@Override
	public abstract String getDesc();
	
	public double calculerPrix(int prix) {
		return prix;
	}
	
}
