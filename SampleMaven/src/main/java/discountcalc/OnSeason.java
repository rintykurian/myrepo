package discountcalc;

public class OnSeason {
	
	public double discount(double price) {
		double disc = 0.40*price;
		System.out.println("OnSeason Discount Amount:" + disc);
		return disc;
		
	}

}
