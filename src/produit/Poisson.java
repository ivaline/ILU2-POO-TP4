package produit;

public class Poisson extends Produit{
	private String date;
	
	public Poisson(String name, String date) {
		super("poisson", date);
		}
	
	public String getDesc() {
		return "poisson" + " " + date;
	}
}
