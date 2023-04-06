package produit;


public class Poisson extends Produit{
	private String date;
	
	private int nbPoisson;
	
	public Poisson(String date) {
		super("poisson","kg");
		this.date = date;
		}
	

	public String getDesc() {
		return super.getName()+" peches " + this.date;
	}
}
