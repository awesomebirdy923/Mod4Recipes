import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bakery {
	
	private List<Cake> cakes = new ArrayList<Cake>();
	
	private Cake highestPrice;
	
	public static void main(String[] args) {
		new Bakery();
	}
	
	public Bakery() {
		for (int i = 0; i < 10; i++) {
			cakes.add(new OrderCake("OrderCake", new Random().nextInt(20), new Random().nextInt(20)));
		}
		for (int i = 10; i < 20; i++) {
			cakes.add(new ReadyMadeCake("ReadyMadeCake", new Random().nextInt(20), new Random().nextInt(20)));
		}
		for (int i = 0; i < cakes.size(); i++) {
			System.out.println(cakes.get(i).toString() + "'s price is: " + cakes.get(i).calcPrice());
		}
		for (int i = 0; i < cakes.size()-1; i++) {
			if(cakes.get(i).calcPrice() > cakes.get(i+1).calcPrice()) {
				highestPrice = cakes.get(i);
			}
		}
		System.out.println("The highest price is " + highestPrice.calcPrice());
	}
	
}
