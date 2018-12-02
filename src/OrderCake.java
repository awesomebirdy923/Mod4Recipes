
public class OrderCake extends Cake{

	private double weight;
	
	public OrderCake(String n, double r, double weight) {
		super(n,r);
		this.weight = weight;
	}
	
	public String toString() {
		return name + "\t" + rate;
	}
	
	public double calcPrice() {
		return rate*weight;
	}
}
