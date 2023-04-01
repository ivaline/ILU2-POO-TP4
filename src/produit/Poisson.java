package produit;


public class Poisson extends Produit{
	private Date date;
	
	private int nbPoisson;
	
	public Poisson(int nbPoisson , Date date) {
		super("poisson",Unite.piece);
		this.date = date;
		this.nbPoisson = nbPoisson;
		}
	
	public String getDesc() {
		return "poisson" + " " + date;
	}
}
