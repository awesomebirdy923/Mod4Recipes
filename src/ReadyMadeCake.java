
public class ReadyMadeCake extends Cake{

	private double quantity;
	
	public ReadyMadeCake(String n, double r, double quantity) {
		super(n,r);
		this.quantity = quantity;
	}

	public String toString() {
		return name + "\t" + rate;
	}
	
	public double calcPrice() {
		System.out.println(" " + toString() + " has sold " + quantity);
		return rate*quantity;
	}
}
